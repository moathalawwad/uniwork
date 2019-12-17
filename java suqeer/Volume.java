public class Volume{
	public static void main (String[]args){
		int det= Integer.parseInt(args[0]);
		double length = Double.parseDouble(args[1]);
		double width = Double.parseDouble(args[2]);
		  if (length>0&&width>0){
				if (det==1){
				double area = length*width;
			  System.out.println("regtangel area is "+area);
				}
				else if (det==2){
					double perimeter = (length+width)*2;
					System.out.println("regtangle perimeter is "+ perimeter);
				}
				else {
					System.out.println("please enter 1 OR 2 to determen what math matic rule want to use !!");
				}
			}
			else {
				System.out.println("please Enter valed number you cant use 0 OR -numbers ");
			}
	}
}
			  