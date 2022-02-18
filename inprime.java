import java.util.*;
class inprime
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=obj.nextInt();
  int i,c=0;
  for(i=2;i<n;i++)
  {
   if (n%i==0)
   {
    c=1;
    System.out.println(n+"is not prime");
    break;
   }
   else 
     continue;
  }
  if(c==0)
    System.out.println(n+"is prime");
 }
}

