class Student{

	private final int id;
	private final String name;
	
	private Student(StudentBuilder builder){
		this.id = builder.id;
		this.name = builder.name;
	}
	
	//getter methods 
	public int getId(){return id;}
	public String getName(){return name;}
	
	//overriding toString() method
	@Override
	public String toString(){	
		return "Student: id = "+ this.id+ " name = "+ this.name;
	}


static class StudentBuilder{
	
	private int id;
	private String name;
	
	public StudentBuilder setId(int id){
		this.id = id;
		return this;
	}
	
	public StudentBuilder setName(String name){
		this.name = name;
		return this;
	}
	
	public Student build(){
		return new Student(this);
	}
  }
}

public class BuilderPatternDemo{
	
	public static void main(String[] args){
		
		Student s1 = new Student.StudentBuilder()
								.setId(1)
								.setName("Jay")
								.build();
								
		System.out.println(s1);	
	}
}