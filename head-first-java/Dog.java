public class Dog{

	String name;
	
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.bark();
		d1.name = "Bart";
		
		//now make a dog array
		Dog[] myDogs = new Dog[3];
		
		//puts some dog objects in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = d1;
		
		//now access the Dog objects using the array 
		//references
		myDogs[0].name = "Fido";
		myDogs[1].name = "Cido";
		
		//dog2 name println
		System.out.print("last dog name is ");
		System.out.println(myDogs[2].name);
		
		//loop through the array 
		//and tell all dogs to bark
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x++;
		}
		
	}
	
	public void bark(){
		System.out.println(name+ " says Bark");
	}
	
	public void eat(){}
}