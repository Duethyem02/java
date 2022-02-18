import java.util.*;
class fsn
{
 public static void main(String args[])
 {
  Scanner in= new Scanner(System.in);
  fsn obj=new fsn();
  int n;
  System.out.println("Select operation:\nFor factorial:1\nFor sum of digits of number:2");
  int x = in.nextInt();
  switch (x)
  {
   case 1:System.out.println("Enter number:");
          n = in.nextInt();
          obj.fact(n);
          break;
   case 2:System.out.println("Enter number:");
          n = in.nextInt();
          obj.sum(n);
          break;
   default:System.out.println("Select a valid option"); 
  }
 }
 void fact(int a)
 {
  int f=1;
  for(int i=1;i<=a;i++)
  {
   f*=i;
  }
  System.out.println("Factorial of "+a+" is: "+f);
 }
 void sum(int a)
 {
  int t=a;
  int s=0;
  int r;
  while(a!=0)
  {
   r=a%10;
   s=s+r;
   a=a/10;
  }
  System.out.println("Sum of digits of "+t+" is: "+s);
 }
}


/*
Output:
//1
Select operation:
For factorial:1
For sum of digits of number:2
1
Enter number:
6
Factorial of 6 is: 720

//2
Select operation:
For factorial:1
For sum of digits of number:2
2
Enter number:
6538
Sum of digits of 6538 is: 22

//3
Select operation:
For factorial:1
For sum of digits of number:2
4
Select a valid option
*/
