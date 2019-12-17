public class Email{
	public static void main (String[]args){
		String email = args[0];
		String pass = args[1];
		int at = email.indexOf("@");
		int at1 = email.indexOf("@",at+1);
		int dot = email.indexOf(".");
		 if (at!=-1){
			 if (at1==-1){
				 if (pass.length()>=8){
					 int dolar = pass.indexOf("$");
					  if (dolar != -1){
							if(email.charAt(0)==pass.charAt(0)){
								if(dot!=-1){//there is some errors with email contains dots !! 
									System.out.println("accepted");
									String domain = email.substring(at +1 , dot);
									System.out.println("your domain is : "+domain);
									System.out.println("your password is :  "+pass);
								}
								else {
									System.out.println("you need to put a dot sign after ur domain");
								}
							}
							else {
									System.out.println("your password must have the same first charracter as ur password");
								}
						}
						  else {
									System.out.println("your password must have dollar sign in it");
								}
				 }
				 else {
									System.out.println("you must have at least 8 charcter");
								}
			 }
			 else {
									System.out.println("you must have only one @");
								}
		 }
		 else {
									System.out.println("your email should have (@) sign after ur domain");
								}
		
		
	}
}