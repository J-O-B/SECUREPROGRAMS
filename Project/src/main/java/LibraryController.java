import io.javalin.http.Context;
import models.Book;
import models.Books;

import java.sql.*;
import java.util.Collections;

public class LibraryController {
    private final String url = "jdbc:mysql://localhost:3306/mysql?allowMultiQueries=true";
    private final String user = "root";
    private final String password = "root";

    public void renderLibrary(Context ctx) {
        Books books = new Books();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "select * from library.books;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Book book = new Book(resultSet.getInt("book_id"), resultSet.getString("book_name"), resultSet.getString("author"), resultSet.getInt("year_published"));
                books.getBooks().add(book);

            }
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        ctx.render("library.jte", Collections.singletonMap("page", books));
    }
    public void addBook(Context ctx) {
        ctx.render("add_book.jte");
    }
    public void addBookRedirect(Context ctx) {
        String bookName= ctx.formParam("book_name");
        String author= ctx.formParam("author");
        Integer year_published= Integer.parseInt(ctx.formParam("year_published"));

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            // Original Vulnerable Code Using Statement
            String sql = "INSERT into library.books(book_name,author,year_published) VALUES ('"+bookName+"', '"+author+"', '"+year_published+"');";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            // Secure Code Using PreparedStatement
            // PreparedStatement fix;
            // fix = connection.prepareStatement("INSERT INTO library.books(book_name, author, year_published) VALUES (?,?,?)");
            // fix.setString(1, bookName);
            // fix.setString(2, author);
            // fix.setInt(3, year_published);
            // fix.executeQuery();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ctx.redirect("/library");
    }
    public void deleteBookRedirect(Context ctx) {
        Integer bookId = ctx.queryParamAsClass("book_id", Integer.class).getOrDefault(null);
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "DELETE from library.books WHERE book_id = '"+ bookId +"';";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ctx.redirect("/library");
    }
}
