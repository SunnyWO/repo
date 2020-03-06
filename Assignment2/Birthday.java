import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * The driver class for Toy.java, meant to purchase birthday gifts for young children
 * @author Sunny
 *
 */


public class Birthday {

	public static void main(String[] args) {
		String name;
		String toy="";
		int age;
		String yesOrNo;
		double totalCost=0;
		String blankTest;
		DecimalFormat dollar = new DecimalFormat("#,##0.00");	//format cost
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Toy Company to choose gifts for young children");
		
		Toy order;
		
		
		boolean sentinal = true;
		//another toy loop
		do {
			System.out.println("\nEnter the name of the child");
			name = scan.nextLine();
			System.out.println("How old is the child");
			//age validation
			blankTest = scan.nextLine();
			if(blankTest.equals("")) {
				age = 0;
			}
			else {
				age = Integer.parseInt(blankTest);
			}
			
			//age-appropriate loop
			do {
				//toy validation loop
				do {
					System.out.println("Choose a toy: plushie, blocks, or a book");
					toy = scan.nextLine();
					if(toy.equalsIgnoreCase("plushie")||toy.equalsIgnoreCase("blocks")||toy.equalsIgnoreCase("book")) {
						sentinal = false;
					}
					else {
						System.out.println("Invalid choice. Please choose again!");
						sentinal = true;
					}
				}while(sentinal);
				
				//instance of Toy
				order = new Toy(toy,age);
				
				if(order.ageOK()) {
					System.out.println("Good Choice!");
					sentinal = false;
				}
				else {
					//validation question
					System.out.println("Toy is not age-appropriate. "
			                     + "Do you want to buy a differnet toy? Yes or No");
					yesOrNo=scan.nextLine();
					sentinal = (yesOrNo.equalsIgnoreCase("Yes")) ? true:false;
				}
			}while(sentinal);
			//ask if card should be added
			System.out.println("Do you want a card with the gift? Yes or No");
			yesOrNo = scan.nextLine();
	    	order.addCard(yesOrNo);
			//ask if balloon should be added
			System.out.println("Do you want a balloon with the gift? Yes or No");
			yesOrNo = scan.nextLine();
	    	order.addBalloon(yesOrNo);
	    	
			//add cost of current order to totalCost
			totalCost += order.getCost();
			//print the order of current child
			System.out.println("The gift for "+name+order.toString());
			
			//validation question
			System.out.println("Do you want another toy? Yes or No");
			yesOrNo=scan.nextLine();
			sentinal = (yesOrNo.equalsIgnoreCase("Yes")) ? true:false;
			
		}while(sentinal);
		
		//print total cost
		System.out.println("\nThe total cost of your order is $"+dollar.format(totalCost));
		//print order number (random between 1-10000)
		System.out.println("\nOrder number is " + (rand.nextInt(100000) + 1));
		//print programmer name
		System.out.println("Programmer: Sunny Onuska");
		
		scan.close();
		
		
	}

}


