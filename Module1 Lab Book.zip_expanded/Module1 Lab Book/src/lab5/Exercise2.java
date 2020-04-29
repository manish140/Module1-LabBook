package lab5_exercise3;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	 int num,flag;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter num: ");
     num=sc.nextInt();
     sc.close();
     System.out.println("Primenumbers are : ");
     for(int i=2;i<=num;i++){
          flag=0;
          for(int j=2;j<=i/2;j++)
          if((i%j)==0){
            flag=1;
            break;
      }
     if(flag==0)
     System.out.print(i+"   ");
     }
}
}
