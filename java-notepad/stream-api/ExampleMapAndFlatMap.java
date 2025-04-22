import java.util.List;
import java.util.stream.Collectors;

class Person{
    private String name;
    private String email;
    private List<String> phoneNumber;

    Person(){}

    Person(String name, String email, List<String> phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }

    List<String> getPhoneNumbers(){
        return this.phoneNumber;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.email + " : " + this.phoneNumber;
    }
}

class PersonDetail{

    static List<Person> getPersonList(){
        return List.of(
            new Person("jay","jay@123.com",List.of("23847523","874580345")),
            new Person("king","king@123.com",List.of("5323523523","756352352")),
            new Person("ajay","ajay@123.com",List.of("978938787","97886868"))
        );
    }
}

public class ExampleMapAndFlatMap{
    public static void main(String [] args){

        List<Person> personList = PersonDetail.getPersonList();
        
        // Java stream map() example, implement mapper on the input element
        // one to one mapping
        List<String> emailList= personList.stream()
                                            .map(person -> person.getEmail()).collect(Collectors.toList());                                 
        // System.out.println(emailList);
        

        // Java stream flatMap() example, implement mapper and flatten the list of list
        // one to many mapping
        List<String> phoneList  =  personList.stream()
                                .flatMap(person -> person.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneList);

    }
}