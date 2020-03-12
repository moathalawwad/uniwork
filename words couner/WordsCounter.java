public class WordsCounter{
	public static void main (String[]args){
		String words = args[0];
		count(words);
	}
	public static void count (String x){
		
		int counter =0;
		for(int i = 1;i<x.length()-1;i++){
			if(x.charAt(i)==(' ')){
				counter++;
				
			}
			
		}
		System.out.println("the amount of words is = "+(counter+1));
	}
}
