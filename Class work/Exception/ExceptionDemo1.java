import java.lang.*;
class ExceptionDemo1{
		
    public static void main(String[] args) {
		
		int i=10;
		try{
					int result = i/0;
		System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("no cannot devide by 0");
			
		}
	
      
    }
}