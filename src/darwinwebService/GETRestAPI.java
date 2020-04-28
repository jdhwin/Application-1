package darwinwebService; 

import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;  
import javax.ws.rs.client.WebTarget;  
import javax.ws.rs.core.MediaType;  
import org.glassfish.jersey.client.ClientConfig;  

public class GETRestAPI {

	public static void main(String[] args) {
// Create a REST Client
		ClientConfig config = new ClientConfig();  
		Client client = ClientBuilder.newClient(config);
// Set a Target
		WebTarget target = client.target("https://api.github.com/users/jdhwin/repos");

// Print Target		
  		System.out.println(
				target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class)
        );
		
	}
}	
