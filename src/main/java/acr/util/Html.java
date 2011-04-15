package acr.util;
import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;


public class Html {

	/**
	 * Returns a date string.
	 * @return String
	 */
	public static String getHtml(String title, String body) {
		return "<html>\n" +
				"	<head><title>"+title+"</title></head>\n" +
				"	<body>\n" +
				getHtmlHeader() +
				"	<pre>\n" +
				escapeHtml(body) +
				"	</pre>\n" +
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
