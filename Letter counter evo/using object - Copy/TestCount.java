import java.util.Scanner;
public class TestCount{
	public static void main (String[]args){
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the text name :)");
		 String cn = scan.nextLine();
		Counter text1 = new Counter(cn);
		Counter text2 = new Counter("track.txt");
		text1.PrintTheNumber();
		System.out.println("**********************************************");
		
	}
}