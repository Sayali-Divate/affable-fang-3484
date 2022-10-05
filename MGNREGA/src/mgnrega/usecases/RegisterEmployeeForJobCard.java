package mgnrega.usecases;

import java.util.Scanner;

import mgnrega.bean.Employee;
import mgnrega.dao.EmployeeDaoImp;

public class RegisterEmployeeForJobCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your adhar number");
		int adhar = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Your name");
		String name = sc.nextLine();
		
		System.out.println("Enter Your age");
		int age = sc.nextInt();
		
		System.out.println("Enter the land holdings in hecters");
		int land = sc.nextInt();
		
		System.out.println("Enter bank account number");
		int accountNo = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter bank name");
		String bankName = sc.nextLine();
		
		System.out.println("Enter branch Name");
		String bankBranch = sc.nextLine();
		
		System.out.println("Do you have individual asset, Yes/No");
		String asset = sc.next();
		
		System.out.println("Enter post No");
		int poN = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter post name");
		String poName = sc.nextLine();
		
		System.out.println("Enter State");
		String state = sc.nextLine();
		
		
		Employee emp = new Employee();
		emp.setAdharNo(adhar);
		emp.setAge(age);
		emp.setBankAccount(accountNo);
		emp.setBankName(bankName);
		emp.setBranchName(bankBranch);
		emp.setIndividualAsset(asset);
		emp.setLandHoldings(land);
		emp.setName(name);
		emp.setPostName(poName);
		emp.setPostNo(poN);
		emp.setState(state);
		
		EmployeeDaoImp dao = new EmployeeDaoImp();
		String msg = dao.registerEmployee(emp);
		
		System.out.println(msg);
	}

}
