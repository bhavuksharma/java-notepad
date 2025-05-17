class Duck {
    private int size;
    private static int instanceCount = 0;

    Duck(){
        instanceCount++;
        System.out.println(instanceCount);
    }

    public void setSize(int theSize){
        size = theSize;
    }

    public int getSize(){
        return size;
    }
}

public class DuckTestStaticVar{

    public static void main(String[] args) {
        Duck d1 = new Duck();
        Duck d2 = new Duck();
        Duck d3 = new Duck();
        Duck d4 = new Duck();
    }

}
