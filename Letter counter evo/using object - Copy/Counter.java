import java.io.*; 
import java.text.DecimalFormat;
class Counter{
String text;
 Counter(String text){
	 
	 this.text=text;
	 
 }
 void CountTheLeters(char x , char X){
	 double total=0;
	 int count = 0;
		//String test = "aa bb cds lol kj my dude";
		try{
		FileReader paragraph = new FileReader(text);
		BufferedReader br = new BufferedReader(paragraph);
                String str = br.readLine();
							
                while(str!=null){
		for(int i=0;i<=str.length()-1;i++){
			char sub = str.charAt(i);
			if(sub==x|sub==X){
				count++;
		}
		  total++;
		}
	
			str = br.readLine();
				}
				double pere = (count/total)*100;
				  pere =Double.parseDouble(new DecimalFormat("##.##").format(pere));
					System.out.println("the count for " +x+" = "+count + " the usage percantage is ="+ pere);
					
			
		}
	  catch(IOException e2){
                    System.out.println("Error");
                }
	 
	 
 }
 
 void PrintTheNumber(){
	  
	 for(int i =97;i<=122;i++){
			
			char x =(char)i;
			char y =(char)(i-32);
			CountTheLeters(x,y);
			
	 }
 }
   
  
  	
 }

