package classesWithAttributes;

public class Product {

	public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _renk) {
		System.out.println("Yapıcı blok çalıştı.");
		_id = _id;
		_renk = _renk;
		_name = _name;
		_price = _price;
		_description = _description;
		_stockAmount = _stockAmount;
	}
	
	public Product() {
		
	}

	// attirubte | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;

	public String getRenk() {
		return _renk;
	}

	public void setRenk(String renk) {
		_renk = renk;
	}

	private String _kod;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String getKod() {
		return _name.substring(0, 1) + _id;
	}

}
