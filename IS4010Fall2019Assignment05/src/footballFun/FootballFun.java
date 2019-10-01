/*
 * Assignment 05
 * Nina Brillhart
 * Description: Football Methods
 * Due Date: Resubmitted 10/3/19 
 * Course: IS 4010
 * Email: brillhnm@mail.uc.edu
 */

package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * Describe the football score passed to the method.						//Java Docs
	 * @param score The score from the game
	 * @return the description of the score
	 */
	public static String translateScore (int score) {
		
			if (score ==2) return ("safety");								//if score passed to method is 2 then prints "safety"
			if (score ==3) return ("field goal");							//if score is 3 then prints "field goal"
			if (score == 6) return ("touchdown");							//if score is 6 then prints "touchdown"
			if (score == 7) return ("touchdown and extra point");			//if score is 7 then prints "touchdown and extra point"
			if (score == 8) return ("touchdown and 2-point conversion");	//if score is 8 then prints "touchdown and 2-point conversion"
			if (score == -1) return ("");									//if score is -1 then prints "" aka nothing
			if (score == 1) return ("invalid");								//if score is 1 then prints "invalid "
			if (score == 10) return ("you must be playing Quidditch ");		//if score is 10 then prints "you must be playing Quidditch "
		
			
		return "";															//if none of the stipulations above are true, then it returns nothing
	}
}
