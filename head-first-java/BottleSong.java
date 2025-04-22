class BottleSong{
	public static void main(String[] args){
	
		int bottleNums = 10;
		String word = "bottles";
		
		while(bottleNums > 0){
			if(bottleNums == 1){
				word = "bottle";
			} 
			
			System.out.println(bottleNums+" green "+word+" hanging on the wall");
			System.out.println(bottleNums+" green "+word+" hanging on the wall");
			System.out.println("And if one green bottle should accidently fall");
			
			bottleNums--;
			
			if(bottleNums ==1){
				System.out.println("They'll be " +bottleNums+" green bottle hanging on the wall");
			}
			else if(bottleNums==0){
				System.out.println("They'll be no green bottles hanging on the wall");
			}
			else{
				System.out.println("They'll be "+bottleNums+" green bottles hanging on the wall");
			}
			
			System.out.println();
		}
	
	}

}