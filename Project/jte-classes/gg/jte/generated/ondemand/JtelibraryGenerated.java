package gg.jte.generated.ondemand;
public final class JtelibraryGenerated {
	public static final String JTE_NAME = "library.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,13,13,13,15,15,15,15,15,15,17,17,17,19,19,19,19,19,19,19,24,24,27};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, models.Books page) {
		jteOutput.writeContent("\n<html lang=\"en\">\n\t<style>\n\t\tform {\n    \t\tdisplay: inline-block; //Or display: inline; \n\t\t}\n\t</style>\n\t<body>\n\t\t<a href=\"/library/add\">Add Book</a>\n\t\t<br/>\n\t    <p>The books are:</p>\n\t    <ul>\n\t\t    ");
		for (int i = 0; i < page.getBooks().size(); ++i) {
			jteOutput.writeContent("\n\t\t        <li>\n\t\t        \t<span>");
			jteOutput.setContext("span", null);
			jteOutput.writeUserContent(page.getBooks().get(i).getBookName());
			jteOutput.writeContent(" - ");
			jteOutput.setContext("span", null);
			jteOutput.writeUserContent(page.getBooks().get(i).getYearPublished());
			jteOutput.writeContent("</span>\n\t\t        \t<br />\n\t\t        \t<span>By ");
			jteOutput.setContext(null, null);
			jteOutput.writeUserContent(page.getBooks().get(i).getAuthor());
			jteOutput.writeContent("\n\t\t\t        \t<form action=\"/library/delete\" method=\"get\">\n\t  \t\t\t\t\t\t<input type=\"hidden\" name=\"book_id\"");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(page.getBooks().get(i).getId())) {
				jteOutput.writeContent(" value=\"");
				jteOutput.setContext("input", "value");
				jteOutput.writeUserContent(page.getBooks().get(i).getId());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent("><br>\n\t\t\t\t\t\t\t<button type=\"submit\">Delete</button>\n\t\t\t\t\t\t</form>  \n\t\t\t\t\t</span>\n\t\t        </li>\n\t\t    ");
		}
		jteOutput.writeContent("\n\t\t</ul>\n\t</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		models.Books page = (models.Books)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
