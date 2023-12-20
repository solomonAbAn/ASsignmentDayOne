import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//1)Write a Java program to check if a number is even or odd. 
		
		System.out.println("1) please give me an integer ");
		Scanner kb = new Scanner(System.in);
		int number = kb.nextInt();
		if (number % 2 == 0) {
			System.out.println("it is even");}
		else {
				System.out.println("it is odd");
			}
	
		

//2)Write a program to calculate the average of three numbers. 

		System.out.println("2) please give me a number");
		Scanner first = new Scanner(System.in);
		double number1 = first.nextDouble();
		
		System.out.println("2) please give me a second number");
		Scanner second = new Scanner(System.in);
		double number2 = first.nextDouble();
		
		System.out.println("2) please give me a third number");
		Scanner third = new Scanner(System.in);
		double number3 = first.nextDouble();
		
		double average = (number1 + number2 + number3)/3;
		System.out.println("the average is " + average);
	
	
		
		
		
//3)Create a program to find the maximum of two numbers. 
		
		System.out.println("3) please give me a number");
		Scanner maximum1 = new Scanner(System.in);
		double max1 = maximum1.nextDouble();
		
		
		System.out.println("3) please give me a second number");
		Scanner maximum2 = new Scanner(System.in);
		double max2 = maximum1.nextDouble();
		
		if(max1>max2) {
			System.out.println(max1 + " is the maximum");
		}
		else if (max1 == max2) {
			System.out.println(max1 + " and " + max2 + " are equal");
		}
		else {
			System.out.println(max2 + " is the maximum");
		}
		
		
		
//4)Write a Java program to check if a person is eligible to vote.
		
		System.out.println("4) please give me your age");
		Scanner ageVote = new Scanner(System.in);
		int vote = ageVote.nextInt();
		
		
		if(vote>=18) {
			System.out.println("your voice can make a change please go vote you are eligible");
		}
		
		else {
			System.out.println("I am sorry you are not eligible to vote you are still under 18");
		}
		
		
		
//5)Create a program to check if a number is positive, negative, or zero
		
		System.out.println("5) please give me a number");
		Scanner negPos = new Scanner(System.in);
		double negpos = negPos.nextDouble();
		
		if(negpos > 0) {
			System.out.println("your number is positive");
		}
		else if (negpos == 0) {
			System.out.println("your number is zero");
		}
		else {
			System.out.println("your number is negative");
		}
		
		

		
		
		
//6)Write a program to determine the largest among three numbers. 
		
		System.out.println("6) please give me a number");
		Scanner largest1 = new Scanner(System.in);
		double large1 = largest1.nextDouble();
		
		
		System.out.println("6) please give me a second number");
		Scanner largest2 = new Scanner(System.in);
		double large2 = largest2.nextDouble();
		
		System.out.println("6) please give me a third number");
		Scanner largest3 = new Scanner(System.in);
		double large3 = largest3.nextDouble();
		
		if(large1>large2) {
			if(large1>large3) {
				System.out.println(large1 + " is the largest");
			}
			else {
				System.out.println(large3 + " is the largest");
			}
			
		}
			
		else {
				if(large2>large3) {
					System.out.println(large2 + " is the largest");
			}
				else {
					System.out.println(large3 + " is the largest");
				}
		}
		
		
		
//7)Write a program to check if a year is a leap year using if-else statements. 		
		
		System.out.println("7) give me a year");
		Scanner leap = new Scanner(System.in);
		int year = leap.nextInt();
		
		if (year%4==0) {
			System.out.println("it is a leap year");
		}
		else {
			System.out.println("it is NOT a leap year");
		}
		
		
//8)Write a program to find the largest among four numbers. 		
		
		System.out.println("8) please give me a number");
		Scanner largestt1 = new Scanner(System.in);
		double largee1 = largest1.nextDouble();
		
		
		System.out.println("8) please give me a second number");
		Scanner largestt2 = new Scanner(System.in);
		double largee2 = largestt2.nextDouble();
		
		System.out.println("8) please give me a third number");
		Scanner largestt3 = new Scanner(System.in);
		double largee3 = largestt3.nextDouble();
		
		System.out.println("8) please give me a foruth number");
		Scanner largestt4 = new Scanner(System.in);
		double largee4 = largestt4.nextDouble();
		
		if(largee1>largee2) {
			if(largee1>large3) {
				if(largee1>largee4) {
				System.out.println(largee1 + " is the largest");
				}
				else {
					System.out.println(largee4 + " is the largest");
				}
			}
			else if(largee2>largee3) {
					 {
						if( largee2>largee4) {
					System.out.println(largee2 + " is the largest");
				}
						else {
							System.out.println(largee4 + " is the largest");
						}
						}
			}
				else {
					System.out.println(largee4 + " is the largest");
				}
		
		
		}
		
		
		
		
//9)Create a program to check if a given number is a perfect square.
		
		System.out.println("9) please give me an integer");
		Scanner pS = new Scanner(System.in);
		int square = pS.nextInt();
		
		if ((square / square^(1/2)) == (square^(1/2))) {
			System.out.println("it is a perfect square");
		}
		else {
			System.out.println("it is not a perfect square");
		}
		
		System.out.println(900^(1/2));
		
		
		
		
	

		
//10)Write a program to find the largest of three numbers using nested if-else statements. 
//11)Write a program to check if a number is positive, negative, or zero using nested if-else. Taking from users 
//12)Create a program to check if a number is even and positive. 
//13)write a program to find the largest among three numbers using nested if-else. 
//14)Create a program to find the roots of a quadratic equation. 
//15)write a program to check if a number is even, odd, or prime using else-if statements. 

		
		
		// ???Isn't it the same as before? what do you mean by nested????
		
		
		
		
 
		
		
		
		
	
			
	}

}