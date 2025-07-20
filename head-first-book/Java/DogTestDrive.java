class Dog{
	int size;
	String name;
	
	public void bark(){
		if(this.size > 60){
			System.out.println("woff! woff!");
		}
		else if(size > 14){
			System.out.println("ruff! ruff!");
		}
		else{
			System.out.println("yip! yip!");
		}
	}
}

public class DogTestDrive{
	public static void main(String[] args){
		Dog d1= new Dog();
		d1.size = 75;
		Dog d2 = new Dog();
		d2.size = 20;
		Dog d3 = new Dog();
		d3.size = 9;
		
		d1.bark();
		d2.bark();
		d3.bark();
	}
}
