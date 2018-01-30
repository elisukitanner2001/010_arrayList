package arraylist;

import javax.swing.JOptionPane;

public class MainInside {
 	
	public static void main(String[] args) {
	StudentFirstNames a2 = new StudentFirstNames();
	/*
	a2.showSize();
	a2.showContents();
	a2.getName();
	a2.addName();
	a2.showContents();
	a2.deleteName();
	a2.showContents();
	a2.replaceName();
	a2.showContents();
	*/
	Boolean running = true;
	
	while (running =true) {
	Object[] selectionsArray = { "Search", "Show Contents", "Add name", "Delete Name", "Replace Name", "Exit"};
	
	String showFirst = "Search";
	String msg = "";
	String selection = (String) JOptionPane.showInputDialog(
			null, 
			"Message: Select a Utility: ",
			"Title: Student Database", 
			JOptionPane.PLAIN_MESSAGE, 
			null, 
			selectionsArray, 
			showFirst);
	if (selection == null) selection = "Cancelled";// .equals doesn't work, null is not a String; also no curlies because one line only if statement
	JOptionPane.showMessageDialog(null, "You have selected: " + selection);

	switch (selection) { // switch on String allowed in Java 7 and higher
	case "Search":
		JOptionPane.showMessageDialog(null, 
				"We are now in the Search switch block");
		
		a2.getName();
		break;
		//break means all done, leave the switch block - almost always use break
		//if no break, execution continues for all remaining cases
	case "Show Contents":
		JOptionPane.showMessageDialog(null, 
			"We are now in the Show switch block ");
		break;
	case "Add name":
		JOptionPane.showMessageDialog(null, 
			"We are now in the Add switch block ");
		a2.addName();
		break;
	case "Delete Name":
		JOptionPane.showMessageDialog(null, 
			"We are now in the Delete switch block ");
		a2.deleteName();
		break;
	case "Replace Name":
		JOptionPane.showMessageDialog(null, 
			"We are now in the Repalce switch block ");
		a2.replaceName();
		break;
	case "Exit":
		JOptionPane.showMessageDialog(null, 
			"We are now in the Exit switch block");
		running = false;
		System.exit(0);
		break;
	default:
		JOptionPane.showMessageDialog(null, 
			"We are now in the Unknown Case or Cancelled switch block");
		running = false;
		System.exit(0);
	}
	a2.showContents();
	}
	
	}
}
/*
 * 1 add this functionality -- ask for a name, add that name to ArrayLis
 * 1a. test -- after each name, show size and contents 
 */
/*
 * 1 all Jop and JAR
 * 2 first is a menu asking for a desired option -- looped
 * 3 menu: show names, add names, remove name, replace name, exit
 * 
 * 
 */
