import java.util.*;
class small
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=obj.nextInt();
  System.out.println("Enter the array:");
  int[] a=new int[100];
  int i;
  for(i=0;i<n;i++)
  {
   a[i]=obj.nextInt();
  }
  int min=a[0];
  for (i=0;i<n;i++)
  {
   if(a[i]<min)
      min=a[i];
   else 
      continue;
  } 
  System.out.println("Smallest element:"+min);
  
 }
}

/*
Output:
Enter the size of array:
5
Enter the array:
4
3
6
2
1
Smallest element:1
*/
