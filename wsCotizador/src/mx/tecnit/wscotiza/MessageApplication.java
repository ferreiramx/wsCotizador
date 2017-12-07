package mx.tecnit.wscotiza;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import mx.tecnit.wscotiza.XMLService;

public class MessageApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public MessageApplication() {
		singletons.add(new XMLService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}