package com.hyp;

public class Test {
   public static void main(String args[]){
	   int x=20;
	   while(x<40){
		   System.out.print("value of x :"+x);
		   x++;
		   System.out.print("\n");
	   }
	   StringBuffer sBuffer=new StringBuffer("test");
	   sBuffer.append("  he ye ping");
	   System.out.println(sBuffer);
   }
}
