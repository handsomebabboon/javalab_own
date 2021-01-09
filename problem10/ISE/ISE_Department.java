package problem10.ISE;
import problem10.*;
import java.util.Scanner;
import java.util.*;
public class ISE_Department implements Department{
    List<Faculty> facultylist = new ArrayList<Faculty>();

    @Override
	public void readData() {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of faculty");
		int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                Faculty faculty = new Faculty();
                System.out.println("Details of " + (i + 1));
                scanner.nextLine();
                System.out.println("Enter the name of faculty member");
                faculty.name = scanner.nextLine();
                System.out.println("Enter the age");
                faculty.age = scanner.nextInt();
               
                System.out.println();
                
                System.out.println("Enter the years of experience");
                faculty.YOE = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the designation");
                faculty.designation = scanner.nextLine();
                System.out.println("Enter the joining date");
                faculty.join_date = scanner.nextLine();
                System.out.println("Enter the subjects handled with spaces ");
                faculty.Subjects_Handled = scanner.nextLine();
                facultylist.add(faculty);
                
            }
            scanner.close();
	}
    
	public void printData() {
		for(int i=0;i<facultylist.size();i++) {
			System.out.print("Name: "+facultylist.get(i).name);
			System.out.println("Age: "+facultylist.get(i).age);
			System.out.println("Years of Experience: "+facultylist.get(i).YOE);
			System.out.println("Designation: "+facultylist.get(i).designation);
			System.out.println("Joining Date"+facultylist.get(i).join_date);
			System.out.println("Subjects Handled"+facultylist.get(i).Subjects_Handled);
		}
	}
    
    public void print_number_designations(){

    }
    public void number_research_consultancy_projs(){

    }
}

class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	private int detail;

	AgeException(int a) {
		detail = a;
	}

	public String toString() {
		return "Age is greater than [" + detail + "]";
	}
}