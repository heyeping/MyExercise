package com.hyp;

public class ArrayTest {
   public static void main(String args[]){
	   int[] myList={4,2,5,3,7};
       for(int i=0;i<myList.length;i++){
		   System.out.println(myList[i]+" ");
          
	   }
	   int total = 0;
	   for(int i=0;i<myList.length;i++){
           total+=myList[i];
	   }
	   System.out.println("total is:"+total);
	   int max=myList[0];
	   for(int i=0;i<myList.length;i++){
		   if(myList[i]>max) max=myList[i];
	   }
	   System.out.println("max is:"+max);
   }
}
