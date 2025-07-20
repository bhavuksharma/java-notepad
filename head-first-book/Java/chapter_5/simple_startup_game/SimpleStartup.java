public class SimpleStartup{
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocations(int[] locations){
        locationCells = locations;
    }

    public String checkYourself(int guess){
        String result = "miss";

        for(int cell : locationCells){
            if(guess == cell){
                numOfHits++;
                result = "hit";
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
