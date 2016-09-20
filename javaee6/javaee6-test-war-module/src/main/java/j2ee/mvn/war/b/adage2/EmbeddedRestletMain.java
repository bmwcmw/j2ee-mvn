package j2ee.mvn.war.b.adage2;

import org.restlet.Component;
import org.restlet.data.Protocol;

/**
 * Standalone mode, unnecessary if the Application is put in contianer like Tomcat
 * @author bmwcmw
 *
 */
public class EmbeddedRestletMain {
	
	public static void main(String[] args) throws Exception {
		// Create a new Component.
		Component component = new Component();
		// Add a new HTTP server listening on port 8182.
		component.getServers().add(Protocol.HTTP, 8182);
		// Attach the application.
		component.getDefaultHost().attach("/adages", new AdagesApplication());
		// Start the web server.
		component.start();
	}
	
}