import java.util.*;//addition of matrix
class addm
{
 public static void main(String args[])
 {
  int i,j;
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter order of 1st matrix:");
  int m=obj.nextInt();
  int n=obj.nextInt();
  System.out.println("Enter order of 2nd matrix:");
  int p=obj.nextInt();
  int q=obj.nextInt();
  int a[][]=new int[10][10];
  int b[][]=new int[10][10];
  int r[][]=new int[10][10];
  if(m==p && n==q) 
  {
   System.out.println("Enter 1st matrix:"); 
   for(i=0;i<m;i++) 
   {
    for(j=0;j<n;j++)
    {
     a[i][j]=obj.nextInt();
    }
   }
   System.out.println("Enter 2nd matrix:");
   for(i=0;i<p;i++)
   {
    for(j=0;j<q;j++)
    {  
     b[i][j]=obj.nextInt();
    }
   } 
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     r[i][j]=a[i][j]+b[i][j];
    }
   }
   System.out.println("Result is:");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     System.out.print(r[i][j]+" ");
    }
    System.out.println();
   }
  }
  else
   System.out.println("Addition is not possible");
 }
}
