import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class App {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8888);

        Handler homeHandler = ctx -> ctx.render("home.jte");
        app.get("/", homeHandler);

        PingControllers pingControllers = new PingControllers();


        Handler pingHandler = ctx -> pingControllers.pingHome(ctx);
        app.get("/ping", pingHandler);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        LibraryController booksControllers = new LibraryController();

        Handler renderLibraryHandler = ctx -> booksControllers.renderLibrary(ctx);

        Handler deleteBookHandler = ctx -> booksControllers.deleteBookRedirect(ctx);

        Handler addBookRedirectHandler = ctx -> booksControllers.addBookRedirect(ctx);

        Handler addBookHandler = ctx -> booksControllers.addBook(ctx);

        app.get("/library", renderLibraryHandler);
        app.get("/library/delete", deleteBookHandler);
        app.get("/library/add", addBookHandler);
        app.post("/library/add", addBookRedirectHandler);
    }
}
