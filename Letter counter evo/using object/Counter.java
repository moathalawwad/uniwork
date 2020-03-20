import java.io.*; 
class Counter{
String text;
 Counter(String t){
	 
	 text=t;
	 
 }
 void CountTheLeters(char x , char X){
	 
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
		
		}
	
			str = br.readLine();
				}
					System.out.println(x+"="+count );
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

