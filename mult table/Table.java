public class Table{
	
	public static void main(String[]args){
		table(Integer.parseInt(args[0]));
		
}
 public static void table(int n){
	 int t = 1;
	 for(int i =1;i<=10;i++){
		 
		 t=n*i;
		 System.out.println(t);
		 
	 }
 }
}