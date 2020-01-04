public class Multi{
	public static void main (String[]args){
		int num =Integer.parseInt(args[0]);
		int pow =Integer.parseInt(args[1]);
		int counter = 1;
		int f = 1;
		for (int i = 1;i<=pow;i++){
			counter=num*counter;
		}
		System.out.println(counter);
		
		for (int i=pow;i>=1;i--){
			f=f*i;
			
		}
		System.out.println(f);
	}
	  
}