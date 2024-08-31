package Assignment2;
class car{
	String carname;
	int price;
	String color;
	int year;
	public car(String carname,int price,String color,int year) {
		this.carname=carname;
		this.price=price;
		this.color=color;
		this.year=year;
	}
	public void display() {
		System.out.println("Carname "+carname);
		System.out.println("Price "+price);
		System.out.println("Color "+color);
		System.out.println("year "+year);
	}
	public void updateCardetails(String carname,int price) {
		this.carname=carname;
		this.price=price;
	}
	public void updateCardetails(String carname,int price,String color) {
		this.carname=carname;
		this.price=price;
		this.color=color;
	}
	public void updateCardetails(String carname,int price,String color,int year) {
		this.carname=carname;
		this.price=price;
		this.color=color;
		this.year=year;
	}
}
public class Main {
	
	public static void main(String[] args) {
    car c1 = new car("BMW", 8500000, "Black", 2020);
    
        System.out.println("Initial Car Details:");
        c1.display();
        System.out.println();
  
        c1.updateCardetails("BMW", 9000000);
        System.out.println("After updating Car Name and Price:");
        c1.display();
        System.out.println();

        c1.updateCardetails("BMW", 9000000, "Red");
        System.out.println("After updating Car Name, Price, and Color:");
        c1.display();
        System.out.println();

        c1.updateCardetails("BMW", 9000000, "Red", 2021);
        System.out.println("After updating Car Name, Price, Color, and Year:");
        c1.display();
	}

}
