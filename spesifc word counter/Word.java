public class Word{
	public static void main (String[]args){
		String word = "rrrr for ffff for aaa for asd for lll for";
		int c =0;
		for (int i =0;i<word.length()-2;i++){
			String sub = word.substring(i,i+3);
			if (sub.equals("for")){
				
				c++;
			}
			
		}
		System.out.println(c);
	}
}