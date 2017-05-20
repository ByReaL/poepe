package byreal.apps.ipe.server;

import byreal.apps.ipe.client.IpeService;
import byreal.apps.ipe.shared.FieldVerifier;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class IpeServiceImpl extends RemoteServiceServlet implements IpeService {

	public List<String> getTheLeagues() throws IllegalArgumentException {
		List<String> leagues = new ArrayList<String>();
		
		leagues.add("Standard");
		leagues.add("Standard Hardcore");
		leagues.add("Legacy");
		leagues.add("Legacy Hardcore");
		
		return leagues;
	}

}
