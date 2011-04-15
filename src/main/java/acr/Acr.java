package acr;

import org.restlet.Component;
import org.restlet.data.*;

public class Acr {

	public static void main(String[] args) throws Exception {  
	    // Create a new Component.  
	    Component component = new Component();  
	  
	    // Add a new HTTP server listening on port 8081.  
	    component.getServers().add(Protocol.HTTP, 8081);  
	  
	    // Attach the sample application.  
	    component.getDefaultHost().attachDefault(new AcrApplication());  
	  
	    // Start the component.  
	    component.start();  
	}  
	
}


