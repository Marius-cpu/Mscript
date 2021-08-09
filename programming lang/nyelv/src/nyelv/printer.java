package nyelv;

import java.util.Scanner;

public class printer {
	static String storage3;

	public static void printf() {
		System.out.println("Enter string  to be printed!");
		Scanner d = new Scanner(System.in);
		storage3 = d.nextLine();
		System.out.println(storage3);
	}

}
