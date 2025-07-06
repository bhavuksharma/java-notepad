interface Auditable{
}

class Invoice implements Auditable{
    // Invoice specific properties and methods
}

class Receipt{}

public class CustomMarkerInterfaceExample {
    public static void main(String[] args){     
        Object obj1 = new Invoice();
        Object obj2 = new Receipt();

        CustomMarkerInterfaceExample example = new CustomMarkerInterfaceExample();
        example.audit(obj1);
        example.audit(obj2);
    }

    public void audit(Object obj){
        if(obj instanceof Auditable){
            System.out.println("Auditing object of type: " + obj.getClass().getSimpleName());
        }
        else {
            System.out.println("Object of type " + obj.getClass().getSimpleName() +" is not auditable.");
        }
    }
}
