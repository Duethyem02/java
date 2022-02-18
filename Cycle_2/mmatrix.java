import java.util.*;//multiplication of matrix
class mmatrix
{
 public static void  main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  int i,j,k;
  int a[][]=new int[10][10];
  int b[][]=new int[10][10];
  int r[][]=new int[10][10];
  System.out.println("Enter order of 1st matrix:");
  int m=obj.nextInt();
  int n=obj.nextInt();
  System.out.println("Enter order of 2nd matrix:");
  int p=obj.nextInt();
  int q=obj.nextInt();
  if(n==p)
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
     r[i][j]=0;
     for(k=0;k<n;k++)
     {
      r[i][j]+=a[i][k]*b[k][j];
     }
    }
   }
   System.out.println("Result is:");
   for(i=0;i<m;i++)
   {
    for(j=0;j<q;j++)
    {
     System.out.print(r[i][j]+" ");
    }
    System.out.println();
   }
  }
  else
    System.out.println("Matrix multiplication is not possible");
  
 }
}

/*
Output:
Enter order of matrix:
2
2
Enter matrix:
1
2
3
4
Transpose is:
1 3 
2 4 
*/
