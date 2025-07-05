
// Genereic Class Example in Java

import java.util.List;

class Box<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}

//  Generic Method
// <T> before the return type indicate that method is generic
class Utils{
    public static <T> T getFirstElement(List<T> list){
        return list.get(0);
    }
}



public class GenericCustomClass {
    public static void main(String[] args){
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println("String Value: "+ stringBox.getValue());

        Utils utils = new Utils();
        List<String> strings = List.of("Apple", "Banana", "Cherry");
        System.out.println("First Element: " + Utils.getFirstElement(strings));
        
    }
}
