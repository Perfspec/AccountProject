import java.util.HashMap;

public class Service {
	private HashMap<String, Account> data;

	public Service(HashMap<String, Account> db) {
		data = (HashMap<String, Account>) db.clone();
	}
	
	public void add(String id, Account acc) {
		data.put(id, acc);
	}
	
	public void rm(String id) {
		data.remove(id);
	}
	
	public Account get(String id) {
		return data.get(id);
	}
	

}
