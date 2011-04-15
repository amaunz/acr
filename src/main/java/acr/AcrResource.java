package acr;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


 
public class AcrResource extends ServerResource {
 
    @Get  
    public String represent() {  
        return "hello, world" + " \n\n" + acr.util.Time.getDate() + ".";  
    }  
 
}