package nyelv;

import java.util.Scanner;

public class math {
	static void maths() {
		String storage;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	storage = s.nextLine();
	if(storage.equals("subtraction")) {
		subtr();
		}
	
	if(storage.equals("addition")) {
		add();
		}
	}
	static void add() {
		int a;
		int d;
		System.out.println("Enter two numbers to be added  to eachother!");
		Scanner q = new Scanner(System.in);
		Scanner qw = new Scanner(System.in);
		a = q.nextInt();
		d = qw.nextInt();
		System.out.println("Result is:");
		System.out.println(a + d);
	}
	static void subtr() {
		int storage;
		int storage2;
		System.out.println("Enter first number, press enter, then enter another number then press enter");
		Scanner f = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		storage2 = b.nextInt();
		storage = f.nextInt();
		System.out.println("Result is:");
		System.out.println(storage - storage2);
		
	}
}
