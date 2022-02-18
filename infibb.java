import java.util.*;
class infibb
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the number of terms:");
  int n=obj.nextInt();
  int i,ft,st,tt;
  ft=0;
  st=1;
  System.out.println("Fibonacci series upto"+n+"terms:");
  for (i=0;i<n;i++) 
  {
   tt=ft+st;
   System.out.println(ft);
   ft=st;
   st=tt; 
  }
 }
}
