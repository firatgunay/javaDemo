
public class CustomerManager {
	private ICustomerDal customerdal;

	CustomerManager(ICustomerDal customerdal) {
		this.customerdal = customerdal;
	}

	public void add() {
		this.customerdal.add();
	}
}
