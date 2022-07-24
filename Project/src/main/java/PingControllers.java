import io.javalin.http.Context;
import models.CommandResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class PingControllers {
	public void pingHome(Context ctx) {
		String host= ctx.queryParam("host");
		String commandResult = "";

		if(host != null) {

			String[] cmd = new String[] {"cmd.exe", "/c", "ping " + host};
			Runtime run = Runtime.getRuntime();
			Process pr;
			try {
				pr = run.exec(cmd);
				pr.waitFor();
				BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String line = "";
				while (line != null) {
					commandResult += line + "\n";
					line=buf.readLine();
				}
			}catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
			ctx.render("ping_host.jte", Collections.singletonMap("page", new CommandResult(host, commandResult)));
			
		} else {
			ctx.render("ping_host.jte");
		}
	}
}
