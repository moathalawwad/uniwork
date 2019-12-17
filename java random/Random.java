public class Random{
	public static void main (String[]args){
		int r = (int) (100+ Math.random()*900);
		System.out.println(r);
		int h = r/100;
		int rem = r%100;
		int t = rem/10;
		rem = rem%10;
		int nofd = h+t+rem;
		System.out.println("you have total of : "+nofd);
	}
}
