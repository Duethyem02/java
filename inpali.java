import java.util.*;
class inpali
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=obj.nextInt();
  int s=0,c=n,r;
  while(n!=0)
  {
   r=n%10;
   s=(s*10)+r;
   n=n/10;
  }
  if(c==s)
    System.out.println(c+"is palindrome");
  else 
    System.out.println(c+"is not palindrome");
 }
}
