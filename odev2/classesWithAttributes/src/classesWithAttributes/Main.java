package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		//Product product = new Product(1,"Laptop","Asus Laptop",5000,2,"Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(17543787);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("Siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		/*
		 * 
		System.out.println(product.getName());
		System.out.println(product.getId());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());
		System.out.println(product.getStockAmount());
		 *
		 */

	}

}
