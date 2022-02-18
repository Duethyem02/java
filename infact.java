import java.util.*;
class infact
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter number:");
  int n=obj.nextInt();
  int i,f=1; 
  for(i=1;i<=n;i++)
      f=f*i;
  System.out.println("Factorial ="+f);
 }
}
