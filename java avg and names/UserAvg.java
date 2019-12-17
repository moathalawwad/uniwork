public class UserAvg{
	public static void main (String[]args){
	  String name = args [0] ;
	  Double m1 = Double.parseDouble (args[1])  ;
      Double m2 = Double.parseDouble (args[2])  ;
      Double m3 = Double.parseDouble (args[3])  ;
      Double m4 = Double.parseDouble (args[4])  ; 
	   double avg = (m1+m2+m3+m4)/4;
	   System.out.println("Your Name Is : "+ name );
	   System.out.println("Your Avregae Is = "+avg);
		
		
		
	}
}