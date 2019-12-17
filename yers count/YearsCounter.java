public class YearsCounter{
	public static void main (String[]args){
		int days = Integer.parseInt(args[0]);
		int years = days/356;
		int remdays = days%356;
		int months = remdays/30;
		int remdays1= remdays%30;
		int weeks = remdays1/7;
		int remdays2= remdays1%7;
		System.out.println("years :"+years);
		System.out.println("months :"+months);
		System.out.println("weeks :"+weeks);
		System.out.println("days :"+remdays2);
	}
}