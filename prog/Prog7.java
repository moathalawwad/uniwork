package com.javatpoint;  
  
import java.io.FileReader;  
public class Prog7 {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\thewitch");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    