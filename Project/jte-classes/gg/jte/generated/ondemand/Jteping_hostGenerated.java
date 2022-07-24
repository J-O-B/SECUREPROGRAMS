package gg.jte.generated.ondemand;
public final class Jteping_hostGenerated {
	public static final String JTE_NAME = "ping_host.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,14,14,14,15,15,15,16,16,16,18,18,21};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, models.CommandResult page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n\t<head>\n    \t<meta charset=\"utf-8\">\n    \t<title></title>\n  \t</head>\n\t<body>\n    \t<form action=\"/ping\" method=\"get\">\n    \t\t<label for=\"host\">Host</label>\n\t\t\t<input type=\"text\" name=\"host\"/>\n\t\t\t<br>\n\t\t\t<button type=\"submit\">Ping Host</button>\n\t\t\t<br />\n\t\t\t");
		if (page != null) {
			jteOutput.writeContent("\n\t\t        <h2>Results for ");
			jteOutput.setContext(null, null);
			jteOutput.writeUserContent(page.getHost());
			jteOutput.writeContent("</h2>\n\t\t\t\t<pre>");
			jteOutput.setContext("pre", null);
			jteOutput.writeUserContent(page.getResult());
			jteOutput.writeContent("</pre>\n\t\t\t\n\t\t    ");
		}
		jteOutput.writeContent("\n\t\t</form>\n\t</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		models.CommandResult page = (models.CommandResult)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
