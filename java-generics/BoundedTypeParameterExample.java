class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number){
        this.number = number;
    }

    public T getNumber(){
        return number;
    }
}

public class BoundedTypeParameterExample {
    public static void main(String[] args){
        NumberBox<Integer> intBox = new NumberBox();
        intBox.setNumber(10);

        NumberBox<Double> doubleBox = new NumberBox();
        doubleBox.setNumber(20.5);

        
        // NumberBox<String> stringBox = new NumberBox(); // This will cause a compile-time error

    }
}
