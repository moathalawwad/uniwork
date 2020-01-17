	
import java.io.*;
public class Counter{
	public static void main (String[]args) {
		cin('a');
		cin('b');
		cin('c');
		cin('d');
		cin('e');
		cin('f');
		cin('g');
		cin('h');
		cin('i');
		cin('j');
		cin('k');
		cin('l');
		cin('m');
		cin('n');
		cin('o');
		cin('p');
		cin('q');
		cin('r');
		cin('s');
		cin('t');
		cin('u');
		cin('v');
		cin('w');
		cin('x');
		cin('y');
		cin('z');
	}
	public static void cin(char x){
		int count = 0;
		String test = "aa bb cds lol kj my dude";
		
		
		try{
		FileReader paragraph = new FileReader("thewitch.txt");
		BufferedReader br = new BufferedReader(paragraph);
                String str = br.readLine();
							
                while(str!=null){
		for(int i=0;i<=str.length()-1;i++){
			char sub = str.charAt(i);
			if(sub==x){
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