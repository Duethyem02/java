import java.util.*;//replace a particular element in array
class replace
{
 public static void main(String args[])
 {
  int []a=new int[100];
  int i;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the number of elements in array:");
  int n=obj.nextInt();
  System.out.println("Enter array:");
  for(i=0;i<n;i++)
  {
   a[i]=obj.nextInt();
  }
  System.out.println("Enter the position to be changed:"); 
  int c=obj.nextInt();
  System.out.println("Enter the element to be inserted:");
  int x=obj.nextInt();
  a[c-1]=x;
  System.out.println("New array:"); 
  for(i=0;i<n;i++)
  {
   System.out.println(a[i]+" ");
  }
 } 
}

/*
Output:
Enter the number of elements in array:
5
Enter array:
3
6
9
1
15
Enter the position to be changed:
4
Enter the element to be inserted:
12
New array:
3 
6 
9 
12 
15 
*/
