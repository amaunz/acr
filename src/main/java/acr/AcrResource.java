package acr;

import org.restlet.data.MediaType;
import org.restlet.representation.*;
import org.restlet.resource.*;

public class AcrResource extends ServerResource {

	@Override
	protected void doInit() throws ResourceException {
		super.doInit();
		setNegotiated(true);
	} 


	/**
	 * Returns an HTML representation of hello world using content negotiation.
	 * @return StringRepresentation
	 */
	
	@Get("html")
	public Representation toHTML() {
		System.out.println( "h:" );
		String str = "Hello <html> world!\n";
		str = acr.util.Html.getHtml("ACR::acr", str);
		return new StringRepresentation(str, MediaType.TEXT_HTML);
	}

	/**
	 * Returns a TXT representation of hello world using content negotiation.
	 * @return StringRepresentation
	 */
	@Get("txt")  
	public Representation toTXT() {
		System.out.println( "t:" );
		String str="Hello plain world!\n";
		return new StringRepresentation(str, MediaType.TEXT_PLAIN);  
	}

}