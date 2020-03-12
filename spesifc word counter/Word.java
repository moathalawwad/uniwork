public class Word{
	public static void main (String[]args){
		String word = "rrrr for ffff for aaa for asd for lll for";
		int user = Integer.parseInt(args[0]);
		int use = counter(user,word);
		System.out.println(use);
		System.out.println(counter(user,word));
		
	
	}
	public static int counter (int n, String x ){
			int c =0;
		for (int i =0;i<x.length()-2;i++){
			String sub = x.substring(i,i+n);
			if (sub.equals("for")){
				
				c++;
			}
			
		}
		return c ;
		}
	}
