package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double itemPrice, moneyTendered, changeDue;
		int tensDue, fivesDue, onesDue, quartersDue, dimesDue, nickelsDue, penniesDue;

		System.out.print("Please enter the price of item: ");
		itemPrice = input.nextDouble();

		System.out.print("Please enter the amount of money given: ");
		moneyTendered = input.nextDouble();

		if (moneyTendered < itemPrice) {
			System.out.println("ERROR");
		} else if (moneyTendered == itemPrice) {
			System.out.println("Correct cash paid, no change needed. Have a great day!");
		} else if (moneyTendered > itemPrice) {
			changeDue = moneyTendered - itemPrice;
			changeDue = Math.round(changeDue * 100.0) / 100.0;
			System.out.println("Change Due: " + changeDue + "\n");

			tensDue = (int) (changeDue / 10);
			if (tensDue > 0) {
				System.out.println(tensDue + " ten dollar bill");
			}
			changeDue = changeDue % 10.0;

			fivesDue = (int) (changeDue / 5);
			if (fivesDue > 0) {
				System.out.println(fivesDue + " five dollar bill");
			}
			changeDue = changeDue % 5.0;

			onesDue = (int) (changeDue / 1);
			if (onesDue > 0) {
				System.out.println(onesDue + " one dollar bill");
			}
			changeDue = changeDue % 1;
			changeDue = Math.round(changeDue * 100.0) / 100.0;

			quartersDue = (int) (changeDue / .25);
			if (quartersDue > 0 && quartersDue <= 1) {
				System.out.println(quartersDue + " quarter");
			} else if (quartersDue > 0) {
				System.out.println(quartersDue + " quarters");
			}
			changeDue = changeDue % .25;
			changeDue = Math.round(changeDue * 100.0) / 100.0;

			dimesDue = (int) (changeDue / .10);
			if (dimesDue > 0 && dimesDue <= 1) {
				System.out.println(dimesDue + " dime");
			} else if (dimesDue > 0) {
				System.out.println(dimesDue + " dimes");
			}
			changeDue = changeDue % .10;
			changeDue = Math.round(changeDue * 100.0) / 100.0;

			nickelsDue = (int) (changeDue / .05);
			if (nickelsDue > 0 && nickelsDue <= 1) {
				System.out.println(nickelsDue + " nickel");
			} else if (nickelsDue > 0) {
				System.out.println(nickelsDue + " nickels");
			}
			changeDue = changeDue % .05;
			changeDue = Math.round(changeDue * 100.0) / 100.0;

			penniesDue = (int) (changeDue / .01);
			if (penniesDue > 0 && penniesDue <= 1) {
				System.out.println(penniesDue + " penny");
			} else if (penniesDue > 0) {
				System.out.println(penniesDue + " pennies");
			}
		}
		input.close();
	}
}

/*
 * Overview In the cash register we will calculate the amount of change returned
 * to a customer based on the purchase price and the amount tendered. We will
 * also notify the attendant how many of each piece of currency ($20 ,$10 ,$5
 * ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer.
 * Change should be provided using the largest bill and coin denominations as
 * possible. Denominations that are not used should not be displayed.
 * 
 * Hint: Mod operator
 * 
 * User Story #1 The user is prompted asking for the price of the item.
 * 
 * User Story #2 The user is then prompted asking how much money was tendered by
 * the customer.
 * 
 * User Story #3 Display an appropriate message if the customer provided too
 * little money or the exact amount.
 * 
 * User Story #4 If the amount tendered is more than the cost of the item,
 * display the number of bills and coins that should be given to the customer.
 * 
 * Grading This is a graded project. You are expected to have your project
 * completed by the start of class on Monday morning.
 * 
 * You will be given either a pass or fail based on whether your code works
 * given all of the following test conditions:
 * 
 * Amount: .67, Tendered: .50, Result: Error message Amount: .67, Tendered:
 * 1.00, Result: 1 quarter, 1 nickel, 3 pennies. Amount: .59, Tendered: 1.00,
 * Result: 1 quarter, 1 dime, 1 nickel, 1 penny. Amount: 3.96, Tendered: 20.00,
 * Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
 * Amount: any amount less than 20.00, Tendered: anything greater than amount:
 * correct denominations for correct change.
 * 
 * If the project does work, you will be given a 1 for this week's project.
 * 
 * If the project does not work by the Monday 8:30 deadlinee, you may be given a
 * 0 with the potential of upgrading to .5 as determined by your instructor.
 * 
 * To turn in a project, you must push it to a GitHub repository named
 * MakeChangeProject. You must include a README.md that describes how to run
 * your program.
 */
