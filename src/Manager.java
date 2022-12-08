/**
 * 
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

import javax.naming.AuthenticationException;

/**
 * @author LAP-1
 *
 */
public class Manager {

	/**
	 * @param args
	 */
	
    static ArrayList<String> cars = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int main_choice = main_menu();
		
		if (main_choice == 1) {
			// bring admissions menu
			int admissions_coice = admissions_menu();
			
			if (admissions_coice == 1) {
				//bring the register options
				register_student();
			}
			
		}

	}
	
	public static int main_menu() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for Admissions: ");
		
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        int main_choice = s.nextInt();
        return main_choice;
	}
	
	public static int admissions_menu() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 to register a student: ");
		
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        int admission_choice = s.nextInt();
        return admission_choice;
	}
	
	public static void register_student() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Student Name: ");
		String student_name = s.nextLine();
		
		System.out.println("Student ID: ");
		int student_ID = s.nextInt();
		s.nextLine();
		
		System.out.println("Student Email: ");
		String student_email = s.nextLine();
		
		System.out.println("Student Name: " + student_name);
		System.out.println("Student ID: " + student_ID);
		System.out.println("Student Email: " + student_email);
		
		cars.add(student_name);
	    cars.add(String.valueOf(student_ID));
	    cars.add(student_email);
		
		
				
		
	}
	

}
