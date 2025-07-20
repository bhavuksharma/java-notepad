class Parent{
	
	Parent(String message){
		System.out.println(message);
	}
 int a = 10;
 
 void show(){
	System.out.println("parent class show() method");
 }
}

public class Child extends Parent{
	
	public Child(){
		super("Calling Parent Constructor");
	}

    int a = 20;

    @Override
    void show(){
	   System.out.println("Child class show() method");
    }

    void display(){
	    System.out.println(super.a);  // calls parent class variable a
	    super.show(); // calls parent class method show()
    }

	public static void main(String[] args){
		Child c = new Child();
		c.display();
	}

}