import java.util.Scanner;
class Car{
 String colour;
 int price;
 float km;
 String model;
 
 
 void property(){
 Scanner sc= new Scanner(System.in);
 System.out.print("colour of car is : ");
 this.colour=sc.nextLine();
 System.out.print("price of car is : ");
 this.price=sc.nextInt();
 System.out.print("km is : ");
 
 this.km=sc.nextFloat();
 sc.nextLine();
 System.out.print("model of car is : ");
 this.model=sc.nextLine();
 sc.close();
 }
 
 void output(){
  System.out.println("colour of car is : " +this.colour);
   System.out.println("price of car is : " +this.price);
    System.out.println("km is : " +this.km);
	 System.out.println("model of car is : " +this.model);
 }

}
public class program3{
public static void main(String[] args){
Car car1=new Car();
car1.property();
car1.output();
}
}