package unit2lab3;

public class Stars { //creates public class "Stars", which main can call on

	public void printStars(int numLines){ //creates public method "printStars", that uses variable integer "numLines"
		for(int x=1; x<=numLines; x++){ //sets variable x to 1, increases it by 1 each increment as long as it's less than or equal to entered integer "numLines"
		System.out.print("*"); //print out a star until x reaches numLines, so that number of stars will equal "numLines" value
		}
	}
	
	public void printTriangleIteration (int numLines) { //creates public method "printTriangleIteration", that uses variable integer "numLines"
	    int stars = 1; //creates variable stars, sets it to 1
	    while(stars <= numLines) { //repeat following steps while stars is less than/equal to numLines
	        printStars(stars); //prints amount of stars equal to "stars" variable, using earlier printStars method
	        System.out.println(""); //line break
	        stars++; //increases stars by 1 each iteration, until it reaches entered "numLines" value.
	    }
	}

	public void printTriangleRecursion(int numLines){ //creates public method "printTriangleRecursion", that uses variable integer "numlines"
		if(numLines<1)System.out.print(""); //base case: if entered value "numLines" is less than 1, stop printing
		else{ //if not base case, do following actions:
			printTriangleRecursion(numLines-1); //calls on itself in recursive routine; decreases numLines by 1 each time before printing, so that it will start with one star
			printStars(numLines); //print the number of stars equal to "numLines" value, using "printStars" method
			System.out.println("");	//line break after each line of stars printed
		}
	}
	
	public void printReverseTriangle(int numLines){ //creates public method "printReverseTriangle", uses recursive routine, but prints triangle backwards, so it stars with 5 stars and goes down to 1
		if(numLines<1)System.out.print(""); //base case: if entered value "numLines" is less than 1, stop printing
		else{ //if not base case (numLines>=1), do following actions:
			printStars(numLines); //print number of stars equal to "numLines" value, using printStars method
			System.out.println("");	 //line break after each line of stars
			printReverseTriangle(numLines-1); //calls on itself, decreasing numLines value by 1 each time
		}
	}
}