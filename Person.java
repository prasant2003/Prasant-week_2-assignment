package Assignment2;

class a{
	String name;
	int age;
	a(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class Person {

	public static void main(String[] args) {
		a a1=new a("Prasant",20);
		a1.display();

	}

}
