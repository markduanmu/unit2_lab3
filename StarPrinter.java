package unit2lab3;

public class StarPrinter {
	
	public static void main(String[] args){ //main method, calls on public methods made in "Stars" class
		Stars stars1=new Stars(); //creates "stars1" object, an instance of the "Stars" class
				
		stars1.printTriangleIteration(5); //prints triangle using the iterative method, with 5 lines
		
		System.out.println("");
		
		stars1.printTriangleRecursion(5); //prints triangle using recursive method, with 5 lines
		
		System.out.println("");
		
		stars1.printReverseTriangle(5);	//prints reverse triangle using recursive method, with 5 lines
		
		System.out.println("");			
	}
}