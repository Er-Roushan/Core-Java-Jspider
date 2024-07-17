package myCalImplementation;

import java.util.Scanner;
import additionProg.Addition;
import divProg.Division;
import multiProg.Multiplication;
import operationProg.Count;
import operationProg.Cube;
import operationProg.Factorial;
import operationProg.Power;
import operationProg.Factors;
import operationProg.Square;
import subProg.Substraction;


public class Implementation {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to My Program");
		System.out.println("Enter the Option:-");
		System.out.println(" 1:For Addition \n 2:For Substraction \n 3:For Multiplication \n 4:For Division \n 5:For Other Operation \n 6:Exit  ");
		boolean flag = true;
		System.out.println("Enter the Option Here: ");
		int option = obj.nextInt();
		
		do {
			
			switch (option) {
			case 1:
				
//				Addition addobj = new Addition();
				int val1, val2;
				System.out.print("Enter Number first: ");
				val1 = obj.nextInt();
				System.out.print("Enter Number Second: ");
				val2 = obj.nextInt();
				int result = Addition.add(val1, val2);				
				System.out.println("Sum of " + val1 + " and " + val2 + " is = "+ result);
				System.out.print("if you want to perform more operation Enter the respective option else press 6 to Exit........");
				option = obj.nextInt();
				break;
				
			case 2:
				
//				Substraction subobj = new Substraction();
				int num1, num2;
				System.out.print("Enter Number first: ");
				num1 = obj.nextInt();
				System.out.print("Enter Number Second: ");
				num2 = obj.nextInt();
				int sub_result = Substraction.sub(num1, num2);				
				System.out.println("Sum of " + num1 + " and " + num2 + " is = "+ sub_result);
				System.out.print("if you want to perform more operation Enter the respective option else press 6 to Exit........");
				option = obj.nextInt();
				break;
				
			case 3:
				
//				Multiplication mulobj = new Multiplication();
				int m_num1, m_num2;
				System.out.print("Enter Number first: ");
				m_num1 = obj.nextInt();
				System.out.print("Enter Number Second: ");
				m_num2 = obj.nextInt();
				int mul_result = Multiplication.mul(m_num1, m_num2);				
				System.out.println("Sum of " + m_num1 + " and " + m_num2 + " is = "+ mul_result);
				System.out.print("if you want to perform more operation Enter the respective option else press 6 to Exit........");
				option = obj.nextInt();
				break;
				
			case 4:
				
//				Division divobj = new Division();
				int dividend, divisor;
				System.out.print("Enter Dividend: ");
				dividend = obj.nextInt();
				System.out.print("Enter Divisor: ");
				divisor = obj.nextInt();
				int quotient = Division.div(dividend, divisor);				
				System.out.println( dividend + " / " + divisor + " = "+ quotient);
				System.out.print("if you want to perform more operation Enter the respective option else press 6 to Exit........");
				option = obj.nextInt();
				break;
				
			case 5:
				System.out.println("Select Operation what you want to perfrom: ");
				System.out.println(" 1:For Count the digit \n 2:For square \n 3:For cube \n 4:For factorial \n 5:For factor \n 6:for Power \n 7: To Exit  ");
				boolean inner_flag=true;
				System.out.print("Enter the choice of other operation: ");
				int inner_option = obj.nextInt();
				do {
					switch (inner_option) {
					case 1:
//						Count countObj = new Count();
						int number;
						System.out.print("  Enter the number: ");
						number = obj.nextInt();
						int digitcount = Count.countmet(number);
						System.out.println(number + " Has " + digitcount + " digit has in it.");
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
					case 2:
//						Square squareObj = new Square();
						int val;
						System.out.print("  Enter the number: ");
						val = obj.nextInt();
						int square_val = Square.sqr(val);
						System.out.println("Square of "+ val +" is = " + square_val);
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
					case 3:
//						Cube cubeObj = new Cube();
						int c_val;
						System.out.print("  Enter the number: ");
						c_val = obj.nextInt();
						int cube_val = Cube.cub(c_val);
						System.out.println("Cube of "+ c_val +" is = " + cube_val);
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
					case 4:
//						Factorial factorialObj = new Factorial();
						int fact_val;
						System.out.print("  Enter the number: ");
						fact_val = obj.nextInt();
						int result_val = Factorial.facto(fact_val);
						System.out.println("Factorial of "+ fact_val +" is = " + result_val);
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
					case 5:
//						Factors factorObj = new Factors();
						int factors_val;
						System.out.print("  Enter the number: ");
						factors_val = obj.nextInt();
						Factors.factorMethod(factors_val);
						
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
					case 6:
//						Power powerObj = new Power();
						int pow_val;
						System.out.print("  Enter the number: ");
						pow_val = obj.nextInt();
						System.out.print("  Enter the to power number: ");
						int to_pwr = obj.nextInt();
						int pow_result_val = Power.powr(pow_val, to_pwr);
						System.out.println( pow_val +" power " + to_pwr + "is = " + pow_result_val);
						System.out.print("Do you want to perform more other operation if yes Enter the respective option else press 7 to Exit other operation........");
						inner_option = obj.nextInt();
//						inner_flag = false;
						break;
						
						

					case 7:
						System.out.print("if you want to perform more operation Enter the respective option(for addition, substraction, multiplication, division and other operation) else press 6 to Exit........");
						option = obj.nextInt();
						inner_flag = false;
						break;
					
					default:
						System.out.println("Sorry you are not entered predefined options for other operation.");
						System.out.print("Please enter again: ");
						inner_option = obj.nextInt();
						if(inner_option < 1 || inner_option > 7) {
							System.out.println("Sorry you are not entering accepted options..Moving to outer Menu.");
							inner_option = 7;
						    
						    } 
						break;
					
					}
					
				}while(inner_flag);
				
				break;
				
				
			case 6:
				System.out.println("Thank You");
				System.out.println("For more please contact Roushan Kumar");
				flag = false;
				break;
			
			default:
				System.out.println("Sorry you are not entered predefined option.");
//				option = 6;
				
				System.out.print("Please enter a respective option: ");
				option = obj.nextInt();
				if(option < 1 || option > 6) {
					System.out.println("Sorry you are not entering accepted options");
					option = 6;
				    
				    } 
				
			
			}
			
		}while(flag);
		
		
		obj.close();

	}

}
