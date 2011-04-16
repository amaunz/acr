package acr.util;
import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;


public class Html {

	/**
	 * Returns a HTML representation.
	 * @return String
	 */
	public static String getHtml(String title, String body) {
		return getHtml(title, body, true);
	}
	
	/**
	 * Returns a HTML representation, possibly with verbatim content.
	 * @return String
	 */
	public static String getHtml(String title, String body, boolean verbatim) {
		String verb_open=""; if (verbatim) verb_open="	<pre>\n";
		String verb_close=""; if (verbatim) verb_close="	</pre>\n";
		if (verbatim) body=escapeHtml(body);
		
		return "<html>\n" +
				"	<head><title>"+title+"</title></head>\n" +
				"	<body>\n" +
				getHtmlHeader() +
				verb_open +
				body +
				verb_close +
				getHtmlFooter() +
				"	</body>\n" +
				"</html>\n";
	}
	
	/**
	 * Custom ACR header for HTML content
	 * @return String
	 */
	public static String getHtmlHeader() {
		return 	"	<h1>ACR</h1>\n" +
				"	<hr />\n";
	}
	
	/**
	 * Custom ACR footer for HTML content
	 * @return String
	 */
	public static String getHtmlFooter() {
		return 	"	<hr />\n" + 
				"	" + acr.util.Time.getDate() + ".\n";
	}
}
