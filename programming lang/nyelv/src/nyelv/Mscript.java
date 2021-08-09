package nyelv;
// imports
import java.util.Scanner;

public class Mscript {
//	variables
	static String store;

	public static void initLang() {
//		Initializes the so said compiler //
		System.out.println("Loading Mscript...");
		lang();
	}
	
	
	public static void lang() {
		System.out.println("Welcome! Type some keywords then press enter!");
		while(true) {
		Scanner s = new Scanner(System.in);
		store = s.nextLine();
		if(store.equals("printf")) {
			printer.printf();
		}
		
		
		if(store.equals("Exit")){
			exit();
		}
		
		
		if(store.equals("math")) {
			System.out.println("You're about to do math with Mscript");
//			math.subtr();
			math.maths();
		}
		
		
		if(store.equals("about")) {
			credits.about();
			}
		}	
	}
static void exit() {
		System.exit(1);
	}
}
