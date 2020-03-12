public class SubRem{
	
	public static void main(String[]args){
		int i =6,b=2;
		int subb = sub(i,b);
		System.out.println("equal = "+subb);
		Rem(i,b);
	}
	public static int sub(int n,int n1){
		int count= 0;
		for(int i=n;i>=n1;i=i-n1){
			count++;
		
				
			}
			return count;
		}
		public static void Rem(int n ,int n1){
			int i=n;
		while(i>=n1){
		
			i=i-n1;
		}
     	System.out.println(i);
		}
	
	
	}	
