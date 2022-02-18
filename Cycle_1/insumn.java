import java.util.*;
class insumn
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter number:");
  int a=obj.nextInt();
  int i,sum=0;
  for(i=1;i<=a;i++)
     sum+=i;
  System.out.println("Sum ="+sum);
 
 }
}

/*
Output:
Enter number:
10
Sum =55
*/
