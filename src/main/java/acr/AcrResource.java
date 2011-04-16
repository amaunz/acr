package acr;

import org.restlet.data.MediaType;
import org.restlet.representation.*;
import org.restlet.resource.*;

import acr.hello.Hello;

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
		String str = Hello.Greet();
		str = acr.util.Html.getHtml(this.getClass().getSimpleName(), str);
		return new StringRepresentation(str, MediaType.TEXT_HTML);
	}

	/**
	 * Returns a TXT representation of hello world using content negotiation.
	 * @return StringRepresentation
	 */
	@Get("txt")  
	public Representation toTXT() {
		String str = Hello.Greet();
		return new StringRepresentation(str, MediaType.TEXT_PLAIN);  
	}

}