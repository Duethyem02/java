import java.util.*;
class employee
{
 int empno;
 String name;
 long phn;
 Scanner obj = new Scanner(System.in);
 public static void main(String args[])
 {
  employee e[] = new employee[5];
  for(int i=0;i<5;i++)
  {
   e[i]= new employee();
   e[i].read();
  } 
  System.out.println("Details");
  for(int i=0;i<5;i++)
  {
   e[i].print();
  } 
 }
 void read()
 {
  System.out.println("Enter name,employee_number,phone_number");
  this.name = obj.nextLine();
  this.empno = obj.nextInt();
  this.phn = obj.nextLong();
 } 
 void print()
 {
  System.out.println("Name:"+this.name+"\nEmployee No.:"+this.empno+"\nPh.No:"+this.phn);
  System.out.println("----------------------------------");
 }
}

/*
Output:
Enter name,employee_number,phone_number
Nithin Joy
34567
9578432569
Enter name,employee_number,phone_number
Shamna Sherin K V
23685
9845672301
Enter name,employee_number,phone_number
Fahma
78023
8547673450
Enter name,employee_number,phone_number
Jino Jimmy
98231
9496957286
Enter name,employee_number,phone_number
Slowmo Manesh 
56091
8457273697
Details
Name:Nithin Joy
Employee No.:34567
Ph.No:9578432569
----------------------------------
Name:Shamna Sherin K V
Employee No.:23685
Ph.No:9845672301
----------------------------------
Name:Fahma
Employee No.:78023
Ph.No:8547673450
----------------------------------
Name:Jino Jimmy
Employee No.:98231
Ph.No:9496957286
----------------------------------
Name:Slowmo Manesh 
Employee No.:56091
Ph.No:8457273697
----------------------------------
*/
