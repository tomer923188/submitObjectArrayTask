
public class Pen {
	private String color;
	private boolean eraseable;
	private double price;
	//constructor
	public Pen (String color, boolean eraseable, double price) {
		this.color = color;
		this.eraseable = eraseable;
		this.price = price;
	}
	//copy constructor
	public Pen (Pen other) {
		this.color = other.color;
		this.eraseable = other.eraseable;
		this.price = other.price;
	}
	//returns the price
	public double getPrice() {
		return price;
	}
	//sets price
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public boolean getEraseable() {
		return eraseable;
	}
	//prints out the information
	public String toString() {
		return "The pen's color is: "+this.color+" The pen's price is: "+this.price+" is it eraseable: "+this.eraseable;
	}
	public String moreExpensivePen(Pen other) {
		if (this.getPrice() > other.getPrice()) {
			return this.getColor();
		}
		else {
			return other.getColor();
		}
	}
	public double averagePrice(Pen other) {
		double sum = (this.getPrice()+other.getPrice());
		return sum/2;
	}
	
}
