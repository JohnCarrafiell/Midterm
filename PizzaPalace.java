/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <John Carrafiell>
 * @version <20/10/14>
 */
import java.util.Scanner;

public class PizzaPalace {

	public static void main(String[] args) {
		
      double numPeople = 0.0;
      double numSlice = 0.0;
      double numSlices = 0.0;
      double numPizzas = 0.0;
      
      Scanner scnr = new Scanner (System.in);
      System.out.println("Input the number of people to feed: ");
      numPeople = scnr.nextDouble();
      System.out.println("Input the number of slices per person: ");
      numSlice = scnr.nextDouble();
      System.out.println("Input the number of slices per pizza: ");
      numSlices = scnr.nextDouble();
      
      numPizzas = (numPeople * numSlice)%(numSlices);
      numPizzas = Math.ceil(numPizzas);
      
      System.out.println(+numPizzas+" is the number of pizzas to purchase");
		// NOTE
		// The Math class provides a function, ceiling(), which will take a double
		// and return the next higher integer value.
		// For example, Math.ceiling(4.125) would evaluate to 5

	}

}
