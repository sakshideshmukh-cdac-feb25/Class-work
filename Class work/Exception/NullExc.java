//Write a Java program where you initialize a String as null and try to call the .length() method on it. Handle the exception using a try-catch block.

import java.lang.*;
class NullExc{
public static void main(String[] args){
	try{
	String s=null;
	int x=s.length();
	System.out.println(x);}
	catch(NullPointerException e){
		System.out.println("NullPointerException Caught");
	}
 
 }}