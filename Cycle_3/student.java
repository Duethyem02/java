import java.util.*;
class student
{
 String name;
 int rollno;
 int m1,m2,m3,m4,m5;
 Scanner obj=new Scanner(System.in);
 void read (student s)
 {
  System.out.println("Name,Roll no,Marks");
  s.name=obj.nextLine();
  s.rollno=obj.nextInt();
  s.m1=obj.nextInt();
  s.m2=obj.nextInt();
  s.m3=obj.nextInt();
  s.m4=obj.nextInt();
  s.m5=obj.nextInt();
 }
 void display(student s)
 {
  System.out.println("Name: "+s.name); 
  System.out.println("Roll no: "+s.rollno);
  System.out.println("Marks:\n"+s.m1+"--"+s.m2+"--"+s.m3+"--"+s.m4+"--"+s.m5);
 }
 public static void main(String ars[])
 {
  
  student s = new student();
  System.out.println("Enter details and mark:");
  s.read(s);
  s.display(s);
 }
}





/*
Output:
Enter details and mark:
Name,Roll no,Marks
Ashwin
15
23
24
21
25
19
Name: Ashwin
Roll no: 15
Marks:
23--24--21--25--19
*/
