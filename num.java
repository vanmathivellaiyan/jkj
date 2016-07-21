package prime;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
          int a;
          int count=0;
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          for(int i=2;i<a;i++)
          {
        	  if((a%i)==0)
        	  count++;
        	  }
          
          if(count>=1){
        	  System.out.println("given number is not prime");
          }
          else{
        	  System.out.println("given number is  prime");
          }

	}

}
