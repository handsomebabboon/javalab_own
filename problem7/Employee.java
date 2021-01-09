
package problem7;

import java.util.Scanner;


public class Employee {
	String name;
	String education;
	int age;
	int YOE;
	int basic; 
	int NumOfLoans;
	int loanAmt;
	int tax;
	Salary salary;

	Employee(String name, int age, String education, int YOE, int NumOfLoans, int basic,int loanAmt) {

		this.name = name;
		this.age = age;
		this.education = education;
		this.YOE = YOE;
		this.NumOfLoans = NumOfLoans;
		this.basic = basic;
		this.loanAmt = loanAmt;
		salary = new Salary(basic);

	}

	class Salary {
		float basic, da, hra, total;
	
		Salary(float basic) {
			this.basic = basic;
			hra = (float) (basic * 0.5);
			da = (float) (basic * 0.7);
			total = basic + hra + da;
		}
	
	}

	void taxPay(){
		if (salary.total < 600000)
			tax = 0;
		else if ((salary.total > 600000) && (salary.total < 1000000))
			tax = (int) (0.2 * salary.total);
		else if ((salary.total > 1000000) && (salary.total < 2000000))
			tax = (int) (0.4 * salary.total);
		else if (salary.total > 2000000)
			tax = (int) (0.6 * salary.total);

	}

	
	void isEligible(){
		if ((loanAmt <= salary.total / 3) && (NumOfLoans < 6))
			System.out.println("Employee is eligible for loan");
		else
			System.out.println("Employee isn't eligible for loan");
	}


	void isEligiblePromotion(){
		if (YOE > 7)
			System.out.println("Empoloyee qualifies for promotion ");
		else
			System.out.println("Employee does not qualify for promotion");
	}

	void Display(){
		System.out.println("name: " + name);
		System.out.println("age :" + age);
		System.out.println("education :" + education);
		System.out.println("Years of Experience: " + YOE);
		System.out.println("Number of Loans: " + NumOfLoans);
		System.out.println("Salary: " + salary.total);
		isEligible();
		System.out.println("The tax to be paid is " + tax);
		isEligiblePromotion();
		System.out.println("\n");
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of employees to be created");
		int num = scanner.nextInt();
		Employee employees[] = new Employee[num];
			for (int i = 0; i < num; i++) {
				System.out.println("Enter the information for employee "+(i+1));
				System.out.println("Enter employee name");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Enter the employees age");
				int age = scanner.nextInt();
				System.out.println("Enter Educational qualifications");
				scanner.nextLine();
				String education = scanner.nextLine();
				System.out.println("Enter years of experience");
				int YOE = scanner.nextInt();
				System.out.println("Enter number of Loans");
				int NumOfLoans = scanner.nextInt();
				System.out.println("Enter the basic salary");
				int basic = scanner.nextInt();
				System.out.println("Enter the loan amount");
				int loanAmt = scanner.nextInt();
				employees[i] = new Employee(name, age, education, YOE, NumOfLoans, basic, loanAmt);
			}
		for (int j = 0; j < num; j++){
			System.out.println("employee number "+(j+1)+"'s info");
			employees[j].Display();
			System.out.println("\n");
		}
		scanner.close();
	}
}
