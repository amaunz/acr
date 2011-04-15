package acr;

import org.restlet.Application;  
import org.restlet.Restlet;  
import org.restlet.routing.Router;  

public class AcrApplication extends Application {

    /** 
     * Creates a root Restlet that will receive all incoming calls. 
     */  
    @Override  
    public synchronized Restlet createInboundRoot() {    	
        Router router = new Router( getContext() );  
        router.attach("/acr", AcrResource.class);
        getTunnelService().setEnabled(true);
        getTunnelService().setExtensionsTunnel(true);
        return router;  
	}

}