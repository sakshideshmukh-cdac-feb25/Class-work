import java.util.Scanner;
class Employee{
	int empId;
	String empName;
	int empSal;
	

}
public class program{
public static void main(String[] args){
Scanner scn= new Scanner(System.in);
Employee emp = new Employee();

System.out.print("Id : ");
emp.empId = scn.nextInt();
scn.nextLine(); 
System.out.print("Name : ");
emp.empName = scn.nextLine();

System.out.print("Salary : ");
emp.empSal = scn.nextInt();


System.out.println("Id : " + emp.empId);
System.out.println("Name : "+ emp.empName);
System.out.println("Salary : "+ emp.empSal);
scn.close();}



}
