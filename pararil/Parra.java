public class Parra{
	public static void main (String[]args){
		String us =args[0];
		ParCheck("lal");
		ParCheck("12345");
		ParCheck("12321");
		ParCheck(us);
	}
	public static void ParCheck(String p){
		String print = "";
		for(int i=p.length()-1;i>=0;i--){
			print=print+p.charAt(i);
			
		}
		System.out.println(print);
		if(print.equals(p)){
			System.out.println("Yes its par");
			
		}
		else{System.out.println("not Par");}
	}
}