import java.util.*;//Second largest element in an array
class large
{
 public static void main(String args[])
 {
  int [] a=new int [100]; 
  Scanner obj=new Scanner (System.in);
  System.out.println("Enter array size:"); 
  int n=obj.nextInt();
  System.out.println("Enter array:");
  int i=0,j=0,temp;
  for(i=0;i<n;i++)
  {
   a[i]=obj.nextInt();
  }
  for(i=0;i<n-1;i++)
  {
   for(j=0;j<n-i-1;j++)
   {
    if(a[j]>a[j+1])
    {
     temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp; 
    }
   }
  } 
  System.out.println("Second largest element:"+a[n-2]);
 } 
}

/*
Output:
Enter array size:
5
Enter array:
4
7
9
5
3
Second largest element:7
*/
