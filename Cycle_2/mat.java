import java.util.*;//largest elemnt in a nxn matrix
class mat 
{
 public static void main(String args[])
 { 
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter order of matrix(NXN)");
  int r=obj.nextInt();
  int c=r;
  int a [][]=new int[10][10];
  int max,i,j;
  System.out.println("Enter matrix:");
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    a[i][j]=obj.nextInt(); 
  
   }
  }
  max=a[0][0];
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
    if(a[i][j]>max)
       max=a[i][j];
   }
  }
  System.out.println("largest element:"+max);
 }
}
