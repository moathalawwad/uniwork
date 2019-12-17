public class ShopOrder{
	public static void main (String[]args){
		int romy = Integer.parseInt(args[0]);
		double sugerprice = Double.parseDouble(args[1]);
		if(romy>=1){
			System.out.println("buy romy");
			
		}
		else{
			System.out.println("buy normal cheese");
			
		}
		if(sugerprice<10){
			System.out.println("buy 2 KG suger");
		}
		else{
			System.out.println("buy 1 KG suger");
			
		}
		System.out.println("now back to home ");
	}
}
