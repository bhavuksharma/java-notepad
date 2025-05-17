import java.util.ArrayList;

public class StartupBust {
    private int numOfGuesses = 0;
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private GameHelper helper = new GameHelper();

    public void setUpGame(){
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(Startup startup : startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        } // close of for loop
    } // close of setUpGame() method

    public void startPlaying(){
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        } // end of while loop
        finishGame();
    } // close of startPlaying() method

    public void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for(Startup startupToTest : startups){
            result = startupToTest.checkYourself(result);

            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                startups.remove(startupToTest);
                break;
            }
        } // end of for loop

        System.out.println(result);
    } // end of checkUserGuess() method

    public void finishGame(){
        System.out.println("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you "+numOfGuesses+ " guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. "+numOfGuesses+" guesses.");
            System.out.println("Fish are dancing with your options.");
        }
     } // end of method finishGame()

     public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
     }

}
