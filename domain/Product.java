package domain;

public class Product {
      private int id;
      private String name;
      Price price;
      Measurement weight;
      
	 Product(int id, String name, Price price, Measurement weight) {
		this.id = id;
		this.name = name;
		this.price= price;
		this.weight = weight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Measurement getWeight() {
		return weight;
	}
	public void setWeight(Measurement weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}

      
}


