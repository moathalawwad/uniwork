public class FactTest{
	public static void main (String[]args){
		int q=10,q1=7,q3=3;
		int user =Integer.parseInt(args[0]);
		int fu=fact(user);
		System.out.println(fu);
		
		int s =fact(5);
		System.out.println(s);
		System.out.println(fact(10));
		System.out.println(fact(q3));
		pow(2,4);
		pow(q1,q);
		pow(fact(q3),q1);
		pow(user,q1);
		pow(fu,3);
		pow(q3,3);
		
	}
	
	public static int fact(int n ){
		int f =1;
		
		for(int i=n;i>=1;i--){
			f=f*i;
			
		}
		return f ;
	}
	public static void pow(int n,int p){
		int counter=1;
		for (int i=1;i<=p;i++ ){
			counter=counter*n;
			
		}
		System.out.println(counter);
	}
}