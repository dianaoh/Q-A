import java.util.*;
public class Q_A {

	public static void main(String[] args) {
		
		System.out.println("Hello! This is Diana's Q&A page! Type 1 to continue");
		int x=1;
		Scanner a = new Scanner(System.in); 
		x = a.nextInt();
		while (x!=0)
		{
			
			System.out.println("Q&A start:");
			System.out.println("Q:Hello! What's your name, and where are you from?");
			System.out.println("A:Hello! My name is Diana and I am from South Korea.");
			x = a.nextInt();
			System.out.println("Q:How many family members do you have in your house?");
			System.out.println("A:I have five family members including me.");
			x = a.nextInt();
			System.out.println("Q:who are they?");
			System.out.println("A:Me, my mom, my dad, my brother, and my hedgehog.");
			x = a.nextInt();
			System.out.println("Q:What is the name of your hedgehog?");
			System.out.println("A:My hedgehog's name is spiky because he has a lot of spikes.");
			x = a.nextInt();
			System.out.println("Q:What is your favorite food?");
			System.out.println("A:My favorite food is Steak, especially when they are cooked medium or medium-rare.");
			x = a.nextInt();
			System.out.println("Q:What is your favorite dessert");
			System.out.println("A:I really can't decide... but I will go with ice cream!");
			x = a.nextInt();
			System.out.println("Q:Which flavor?");
			System.out.println("A:These questions are getting very hard... Probably mango, yogurt, blueberry, strawberry or cookies and cream.");
			x = a.nextInt();
			System.out.println("Q:Who is your favorite musician?");
			System.out.println("A:My favorite musician is Doja Cat and Ariana Grande.");
			x = a.nextInt();
			System.out.println("Q:What is your favorite TV show?");
			System.out.println("A:Victorious- My favorite character from victorious is Cat!");
			x = a.nextInt();
			System.out.println("Q:What are you most excited for Java lessons in St. Marks?");
			System.out.println("A:Making Projects and just coding in general!");
			x = a.nextInt();
			System.out.println("Q:Outside of academic work, what are you excited for?");
			System.out.println("A:I am most excited for dorm life at St. Marks!");
			System.out.println("====Q&A fin===\n");
			System.out.println("Would you like to quit? Type 0 to quit, 1 to read again.");
			x = a.nextInt();
		}

	}

}
