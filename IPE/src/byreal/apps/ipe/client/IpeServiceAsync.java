package byreal.apps.ipe.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>IpeService</code>.
 */
public interface IpeServiceAsync {
	void getTheLeagues(AsyncCallback<List<String>> callback) throws IllegalArgumentException;
}
