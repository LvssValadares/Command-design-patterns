/*Instituto Federal da Bahia
 *Professor Sandro Andrade
 *Student Lucas Valadares Silva Santos
 *Discipline design patterns  
*/
package commandPackage;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle("black",0,0);
		CommandHistory history = new CommandHistory();
		
		Scanner scanner = new Scanner(System.in);
		int option;
		do {
			System.out.println("..........................................");
			System.out.println("Current position X => " + rectangle.getPositionX() + ", Y =>" + rectangle.getPositionY());
			System.out.println("..........................................");
			System.out.println("Current color: " + rectangle.getColor());
			System.out.println("..........................................");
			System.out.println("1 => move the rectangle");
			System.out.println("2 => change color of the rectangle");
			System.out.println("3 => undo");
			System.out.println("4 => redo");
			System.out.println("0 => exit");
			System.out.println("Choice your option");
			System.out.println("..........................................");
			option = Integer.parseInt(scanner.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter the coordinates X and Y: ");
				history.add(new ChangePositionCommand(rectangle, Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine())));
				break;
            case 2:
	            System.out.print("Enter new color: ");
	            history.add(new ChangeColorCommand(rectangle, scanner.nextLine()));
	            break;
	        case 3:
	            if (!history.moveBack()) 
	            	System.out.println("Cannot undo");
	            break;
	        case 4:
	            if (!history.moveFront()) 
	            	System.out.println("Cannot redo");
	            break;
	        }		
		} while (option != 0);
	}
}	