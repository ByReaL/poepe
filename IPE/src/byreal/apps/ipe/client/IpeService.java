package byreal.apps.ipe.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("servlet")
public interface IpeService extends RemoteService {
	List<String> getTheLeagues() throws IllegalArgumentException;
}
