	
import java.io.*;
public class Counter{
	public static void main (String[]args) {
		cin('a','A');
		cin('b','B');
		cin('c','C');
		cin('d','D');
		cin('e','E');
		cin('f','F');
		cin('g','G');
		cin('h','H');
		cin('i','I');
		cin('j','J');
		cin('k','K');
		cin('l','L');
		cin('m','M');
		cin('n','N');
		cin('o','O');
		cin('p','P');
		cin('q','Q');
		cin('r','R');
		cin('s','S');
		cin('t','T');
		cin('u','U');
		cin('v','V');
		cin('w','W');
		cin('x','X');
		cin('y','Y');
		cin('z','Z');
	}
	public static void cin(char x,char X){
		int count = 0;
		//String test = "aa bb cds lol kj my dude";
		
		
		try{
		FileReader paragraph = new FileReader("thewitch.txt");
		BufferedReader br = new BufferedReader(paragraph);
                String str = br.readLine();
							
                while(str!=null){
		for(int i=0;i<=str.length()-1;i++){
			char sub = str.charAt(i);
			if(sub==x|sub==X){
				count++;
		}
		
		}
	
			str = br.readLine();
				}
					System.out.println(x+"="+count );
		}
	  catch(IOException e2){
                    System.out.println("Error");
                }
		 
	}
}