public class Mark{
	public static void main (String[]args){
		double avg = Double.parseDouble(args[0]);
		if (avg >=90){
			System.out.println("Exilant");
		}
		else if (avg >=80){
			System.out.println("Vary good");
		}
		else if (avg >= 70){
			System.out.println("Good");
		}
		else{ System.out.println("FAIL");
		}
	}
}
