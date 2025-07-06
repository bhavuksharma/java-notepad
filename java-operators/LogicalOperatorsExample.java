public class LogicalOperatorsExample {
    public static void main(String[] args){

        // boolean variables
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("Initial values: "+ "cond1 = " + cond1 + ", cond2 = " +cond2);
        
        // Using longical operators
        boolean andResult = cond1 && cond2;
        System.out.println("Result of cond1 AND cond2: " + andResult);

        boolean orResult = cond1 || cond2;
        System.out.println("Result of cond1 OR cond2: " + orResult);

        boolean notResult = !cond1;
        System.out.println("Result of NOT cond1: " + notResult);
    }
    
}
