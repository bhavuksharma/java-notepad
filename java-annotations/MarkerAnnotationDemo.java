
// How to use a Marker Annotation in Java

@Auditable
class Invoice{

}

class Customer{

}


public class MarkerAnnotationDemo {

    public static void main(String[] args){
        Object invoice = new Invoice();
        Object customer = new Customer();
        MarkerAnnotationDemo demo = new MarkerAnnotationDemo();
        demo.audit(invoice);
        demo.audit(customer);

    }

    public void audit(Object object){
        // Check if the object is annotated with @Auditable
        if (object.getClass().isAnnotationPresent(Auditable.class)) {
            System.out.println("Object is auditable: " + object.getClass().getSimpleName());
        }
        else{
            System.out.println("Object is not auditable: " + object.getClass().getSimpleName());
        }
    }

    
}
