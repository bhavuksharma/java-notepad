import java.util.ArrayList;

public class Startup {
    private String name;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locations){
        this.locationCells = locations;
    } // end of method

    public void setName(String name){
        this.name =  name;
    } // end of method

    // method to checkout userguess in the list and return result
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index> 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
            }
            else{
                result = "hit";
            }  // end of inner if
        } // end of outer if

        return result;
    } // end of method
} 
