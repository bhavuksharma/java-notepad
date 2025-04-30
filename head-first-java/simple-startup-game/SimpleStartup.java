public class SimpleStartup{
    private int[] startUpLocations;
    private int numOfHits = 0;

    public void setLocations(int[] locations){
        startUpLocations = locations;
    }

    public String checkYourself(int guess){
        String result = "miss";

        for(int value : startUpLocations){
            if(guess == value){
                numOfHits++;
                result = "hit";
                break;
            }
        }

        if(numOfHits == startUpLocations.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
