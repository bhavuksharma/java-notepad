public class SimpleStartupGame{
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();



        int random = (int)(Math.random()*5);
        int[] locations = {random,random+1, random+2};

        SimpleStartup game = new SimpleStartup();
        game.setLocations(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("enter a guess int value between 1 to 7");

            String result = game.checkYourself(guess);
            numOfGuesses++;
            
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You have won in "+ numOfGuesses + " number of guesses.");
            }
        }
        
    }
}