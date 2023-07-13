package beans;

public class ProductClass {
	private int id;
	private String name;
	private String color;
	private float price;

	public ProductClass(int id, String name, String color, float price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}

}
