import java.util.*;
class sofa
{
 public static void main(String args[]) 
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=obj.nextInt();
  System.out.println("Enter the aray:");
  int[]a=new int[100];
  int i,sum=0;
  for(i=0;i<n;i++)
  {
   a[i]=obj.nextInt();
  }
  for(i=0;i<n;i++)
  {
   sum=sum+a[i];
  } 
  System.out.println("Sum ="+sum);
 }
}
