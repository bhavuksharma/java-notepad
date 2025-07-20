public class PhraseOMatic{

	public static void main(String[] args){
	
		String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
		
		String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distrubuted ledger"};
		
		String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "prespective", "design", "orientation"};
		
		//find out how many words are in the list
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate random numbers
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);
		
		//now build phrase
		String phrase = wordListOne[rand1]+" " +wordListTwo[rand2]+" "+wordListThree[rand3];
		
		//print out the phrase created
		System.out.println(phrase);
	}

}