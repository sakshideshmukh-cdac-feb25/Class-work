
class NumberExc{
public static void main(String[] args){
	String s="67a535";
	
try{
int a= Integer.parseInt(s); 
System.out.println(a);}
catch (NumberFormatException e) {
            
            System.out.println("Error: Invalid number format. " );
        }}}

