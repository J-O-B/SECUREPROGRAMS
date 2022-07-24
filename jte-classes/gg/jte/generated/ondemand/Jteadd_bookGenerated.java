package gg.jte.generated.ondemand;
public final class Jteadd_bookGenerated {
	public static final String JTE_NAME = "add_book.jte";
	public static final int[] JTE_LINE_INFO = {16,16,16,16,16,16};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<html lang=\"en\">\n\t<body>\n    \t<form action=\"/library/add\" method=\"post\">\n    \t\t<label for=\"book_name\">Book Name</label>\n\t\t\t<input type=\"text\" name=\"book_name\"/>\n\t\t\t<br>\n\t\t\t<label for=\"author\">Author</label>\n\t\t\t<input type=\"text\" name=\"author\"/>\n\t\t\t<br>\n\t\t\t<label for=\"year_published\">Year Published</label>\n\t\t\t<input type=\"text\" name=\"year_published\"/>\n\t\t\t<br>\n\t\t\t<button type=\"submit\">Add</button>\n\t\t</form>  \n\t\t\t\t\t\n\t</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
