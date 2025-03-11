import java.util.Scanner;
class Employee1{
	int Id;
	String Name;
	void acceptRecord(){
	Scanner sc= new Scanner(System.in);
	
	System.out.print("enter Id : ");
	this.Id = sc.nextInt();
	        sc.nextLine(); 
	System.out.print("enter Name : ");
	this.Name = sc.nextLine();
	}
	
	void printRecord(){
		System.out.println("enter Id : " +this.Id);
		System.out.println("enter Name : " +this.Name);

	}

}
class Program1{
public static void main(String[] args){
	Employee1 emp= new Employee1();
	emp.acceptRecord();
	emp.printRecord();
	}}