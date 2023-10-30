
public class main {

	public static void main(String[] args) {
		
		CustomerManager customermanager = new CustomerManager(new MySqlCustomerDal());
		customermanager.add();
	}

}
