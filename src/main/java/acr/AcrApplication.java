package acr;

import org.restlet.Application;  
import org.restlet.Restlet;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.routing.Router;  

import acr.util.*;

public class AcrApplication extends Application {

	/** 
	 * Creates a root Restlet that will receive all incoming calls. 
	 */  
	@Override  
	public synchronized Restlet createInboundRoot() {    	
		Router router = new Router( getContext() );  
		router.attach("acr", AcrResource.class);


		Restlet mainPage = new Restlet() {
			@Override
			public void handle(Request request, Response response) {
				response.setEntity(Html.getHtml("Main contents", "<a href=\"/acr\">Hello World Application</a>", false), MediaType.TEXT_HTML);
			}
		};
		router.attach("/", mainPage);
		getTunnelService().setEnabled(true);
		getTunnelService().setExtensionsTunnel(true);
		return router;  
	}
}