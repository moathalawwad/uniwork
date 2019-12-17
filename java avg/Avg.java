public class Avg{
	public static void main (String[]args){
		double m1= Double.parseDouble (args[0]);
		double m2= Double.parseDouble (args[1]);
		double m3= Double.parseDouble (args[2]);
		double m4= Double.parseDouble (args[3]);
		double avg = (m1+m2+m3+m4)/4;
		int avvg = (int)avg;
		System.out.println("your avrege is = "+avvg);
	}
}

