public class WordsCounter{
	public static void main (String[]args){
		String words = args[0];
		int counter = 0;
		for (int i=1;i<words.length();i++){
			if(words.charAt(i)==(' ')){
				counter++;
			}
		}
		System.out.println(counter+1);
	}
}