public class Sub{
	public static void main (String[]args){
		int s =Integer.parseInt(args[0]);
		int e =Integer.parseInt(args[1]);
		String massage = "why we are odds and un blalanced ?";
		String str ="";
		for (int i = s ;i<=e;i++){
			str=str+massage.charAt(i);
		}
		System.out.println(str);
	}
	
	
	}