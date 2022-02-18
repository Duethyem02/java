import java.util.*;
class inasg
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter 3 digit number:");
  int n=obj.nextInt();
  int sum=0,temp=n,r; 
  while(n!=0)
  {
   r=n%10;
   sum=sum+(r*r*r);
   n=n/10;
  }
  if(sum==temp)
     System.out.println(temp+"is an armstrong number");
  else
     System.out.println(temp+"is not an armstrong number");
 }
}

/*
Output:
Enter 3 digit number:
153
153is an armstrong number
*/
