import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Person{
    String name;
    String gender;
    String city;

    // constructor
    Person(String name, String gender, String city) {
        this.name = name;
        this.gender = gender;
        this.city = city;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getCity() {
        return city;
    }
}

public class MapGroupingByExample {
    
    public static void main(String[] args) {
        // Example usage of MapDownStreamCollectors
        // This class is a placeholder for demonstrating how to use downstream collectors with maps.

        Person person1 = new Person("Alice","female","New York");
        Person person2 = new Person("Dave", "male", "Los Angeles");
        Person person3 = new Person("Rusky","male","New York");

        List<Person> people = List.of(person1, person2, person3);
        
        // Grouping by gender and then grouping by city
        Map<String, Map<String, List<Person>>> groupedByGenderAndCity = people.stream()
            .collect(Collectors.groupingBy(entry -> entry.getGender(), Collectors.groupingBy(entry -> entry.getCity())
            ));

        System.out.println("Grouped people by Gender and City: " + groupedByGenderAndCity);

    }
}
