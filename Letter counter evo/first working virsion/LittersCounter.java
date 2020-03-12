	
import java.io.*; 

public class LittersCounter{
	public static void main(String[]args){
		String lol ="ahgsfdjagjdga AA zZYy kjdsgfluhalia ldsuivnavlaujhdgfalkiriwtuqqppaiuofygvbcncz,bmkli;jlkd ";	
     
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		int f =0;
		int g =0;
		int h =0;
		int ii =0;
		int j =0;
		int k =0;
		int l =0;
		int m =0;
		int n =0;
		int o =0;
		int p =0;
		int q =0;
		int r =0;
		int s =0;
		int t =0;
		int u =0;
		int v =0;
		int w =0;
		int x =0;
		int y =0;
		int z =0;
	 
		try{
		FileReader paragraph = new FileReader("thewitch.txt");
		BufferedReader br = new BufferedReader(paragraph);
                String str = br.readLine();
							
                while(str!=null){ 
		             System.out.println(str);
		for(int i =0;i<str.length();i++){
			char sub=str.charAt(i);
			if(sub=='a'| sub=='A'){
				a++;
			}
			//if(sub=='a'| sub=='A'){
			//	a++;
			//}
			if(sub=='b'| sub=='B'){
				b++;
			}
			if(sub=='c'| sub=='C'){
				c++;
			}
			if(sub=='d'| sub=='D'){
				d++;
			}
			if(sub=='e'| sub=='E'){
				e++;
			}
			if(sub=='F'| sub=='f'){
				f++;
			}
			if(sub=='g'| sub=='G'){
			g++;
			}
			if(sub=='h'| sub=='H'){
				h++;
			}
			if(sub=='i'| sub=='I'){
				ii++;
			}
			if(sub=='j'| sub=='J'){
				j++;
			}
			if(sub=='K'| sub=='k'){
				k++;
			}
			if(sub=='L'| sub=='l'){
				l++;
			}
			if(sub=='m'| sub=='M'){
				m++;
			}
			if(sub=='n'| sub=='N'){
				n++;
			}
			if(sub=='o'| sub=='O'){
				o++;
			}
			if(sub=='p'| sub=='P'){
				p++;
			}
			if(sub=='Q'| sub=='q'){
				q++;
			}
			if(sub=='R'| sub=='r'){
				r++;
			}
			if(sub=='s'| sub=='S'){
				s++;
			}
			if(sub=='t'| sub=='T'){
				t++;
			}
			if(sub=='U'| sub=='u'){
				u++;
			}
			if(sub=='V'| sub=='v'){
				v++;
			}
			if(sub=='w'| sub=='W'){
				w++;
			}
			if(sub=='x'| sub=='X'){
				x++;
			}
			if(sub=='y'| sub=='Y'){
				y++;
			}
			if(sub=='z'| sub=='Z'){
				z++;
			}
				
		}
								
								str = br.readLine();
 						}	
        								
		
		
	   System.out.println("a"+ a);
	   System.out.println("b"+ b);
	   System.out.println("c"+ c);
	   System.out.println("d"+ d);
	   System.out.println("e"+ e);
	   System.out.println("f"+ f);
	   System.out.println("g"+ g);
	   System.out.println("h"+ h);
	   System.out.println("i"+ ii);
	   System.out.println("j"+ j);
	   System.out.println("k"+ k);
	   System.out.println("l"+ l);
	   System.out.println("m"+ m);
	   System.out.println("n"+ n);
	   System.out.println("o"+ o);
	   System.out.println("p"+ p);
	   System.out.println("q"+ q);
	   System.out.println("r"+ r);
	   System.out.println("s"+ s);
	   System.out.println("t"+ t);
	   System.out.println("u"+ u);
	   System.out.println("v"+ v);
	   System.out.println("w"+ w);
	   System.out.println("x"+ x);
	   System.out.println("y"+ y);
	   System.out.println("z"+ z);
		}
	  catch(IOException e2){
                    System.out.println("Error");
                }
		 
	}
}