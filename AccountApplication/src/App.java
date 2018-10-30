import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		Account acc1 = new Account("Lewis","Webb","126252");
		System.out.println(acc1.getF());
		System.out.println(acc1.getL());
		System.out.println(acc1.getAccNum());
		
		HashMap<String,Account> data = new HashMap<>();
		Service service = new Service(data);
		String id = "1";
		service.add(id, acc1);
		
		System.out.println(service.get(id).getF());
		System.out.println(service.get(id).getL());
		System.out.println(service.get(id).getAccNum());

	}

}
