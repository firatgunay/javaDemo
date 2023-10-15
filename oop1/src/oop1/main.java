	package oop1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		product1.setName("delonghi kahve makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		product2.setName("smeg kahve makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(4);
		product2.setUnitsInStock(5);
		product2.setImageUrl("image2.jpg");
		
		product3.setName("kitchen aid kahve makinesi");
		product3.setUnitPrice(4000);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
		
		Product products[] = {product1, product2, product3};
		
		for(Product item : products) {
			System.out.println(item.getName());
		}
		
		individualCustomer individualcustomer = new individualCustomer();
		individualcustomer.setId(1);
		individualcustomer.setPhone("0522222222");
		individualcustomer.setCustomerNumber("12345");
		individualcustomer.setFirstName("Fırat");
		individualcustomer.setLastName("Günay");
		
		corporateCustomer corporatecustomer = new corporateCustomer();
		corporatecustomer.setCompanyName("xyz");
		corporatecustomer.setCustomerNumber("65432");
		corporatecustomer.setId(2);
		corporatecustomer.setPhone("053333333");
		corporatecustomer.setTaxNumber("11111111111");
		
		Customer customers[] = {individualcustomer, corporatecustomer};
		
		for (Customer i : customers) {
			System.out.println(i.getCustomerNumber());
		}
	}

}
