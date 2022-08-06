package IntFloat;

import java.util.Scanner;

public class IntFloatResult {
	public static void main(String[] args) {
	int number1 = 0;
	int number2 = 0;
	float sum;
	int sum2; 

	
	
	
	//Input value of firstNumber 
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the input of firstNumber=");
    float num1 = input.nextFloat();
     
  
     try{
    	 System.out.print("Please enter again the same input of firstNumber if you input different value your first input will be taken in float value only=");
         String read = input.next();
         number1 = Integer.parseInt(read);
     } catch(NumberFormatException e){
         //ignore
     }
     
     
   //Input value of second Number
     System.out.print("Please enter the input of secondNumber=");
      float num2 = input.nextFloat();
      
     
      try{
     	 System.out.print("Please enter again the same input of secondNumber if you input different value your first input will be taken in float value only=");
          String read = input.next();
          number2 = Integer.parseInt(read);
      } catch(NumberFormatException e){
          //ignore
      }
    
	sum=num1+num2;
	sum2=number1+number2;
	
	if (num1 == number1 && num2 == number2) {        
		
	   System.out.println("sum in integer format:"+sum2); 
	   
		}
		else 
			System.out.println("sum in float format:"+sum); 
	}
}
