public class Emaill{
	public static void main (String[]args){
		String email = args[0];
		String pass = args[1];
		int at = email.indexOf("@");
		int at1= email.indexOf("@",at+1);
		int dot = email.indexOf(".");
		if(at!=-1){
			if(at1==-1){
				if(dot!=-1){
					if(pass.length()>=8){
						if(email.charAt(0)==pass.charAt(0)){
							int dollar = pass.indexOf("$");
							if(dollar!=-1){
								System.out.println("acepted");
								System.out.println("your email is "+email);
								System.out.println("your password is "+pass);
								String domain = email.substring(at+1,dot);
								System.out.println("your domain is "+domain);
								
							}
							else{System.out.println("you must have a dollar sighn in ur password");}
							
						}
						else{System.out.println("the first char in ur email must match ut password ");}
					}
					else{System.out.println("your password must be at least 8 char and numbres");}
				}
				else{System.out.println("you must have a dot after ur domain");}
				
			}
			else{System.out.println("you must have one at sign (@)");}
		}
		else{System.out.println("you must have at (@)after your email");}
	}
}