package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentFirstNames {
	String msg ="";
	

	private ArrayList <String> a2Students = new ArrayList<String>();
	

	public StudentFirstNames() {
		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Micheal");
		a2Students.add("Mitchell");

		
	}
	public void showContents(){
	//System.out.println("contains: " + a2Students);
	
		msg = "names in databse: " + a2Students;
		JOptionPane.showMessageDialog(null, msg);
	//System.out.println(a2Students.get(i));
		
	}
	public void getName() {
		String n = JOptionPane.showInputDialog("What would you like to search for?");
		if (a2Students.indexOf(n)==-1) {
			JOptionPane.showMessageDialog(null, "sorry name not found");
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "name found");
		}
		
	}
	public void showSize() {
		
		System.out.println("number of student names is " + a2Students.size());

	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}


	public void setA2Students(ArrayList <String> a2Students) {
		this.a2Students = a2Students;
	}
	public void addName() {
	String entry =	JOptionPane.showInputDialog("enter a name to add");

		if (a2Students.indexOf(entry) < 0) {
			a2Students.add(entry);
			
			
		}else {
			
			JOptionPane.showMessageDialog(null, "name already exists");
		}
		
	}
	
	public void deleteName() {
		msg="Enter a name to remove from the list";
		String name =JOptionPane.showInputDialog(msg);
		
		
		if (a2Students.indexOf(name) < 0) {
			System.out.println("That name's not on the list!");
		} else {
			a2Students.remove(name);
		}
	}
	public void replaceName() {
		msg="Please enter a name to replace";
		String name = JOptionPane.showInputDialog(msg);
		int index = a2Students.indexOf(name);
		if(index==-1) {
			System.out.println("You didn't put in a name from the list");
			return;
		}
		
		msg = "Please enter the new name";
		name = JOptionPane.showInputDialog(msg);
		a2Students.set(index, name);
		
	}
	
}





