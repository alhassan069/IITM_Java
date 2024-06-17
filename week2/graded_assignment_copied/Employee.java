package graded_assignment;
class FClass2
{
         public static void main(String[] args)
         {
                Employee e1 = new Employee();
                e1.display();
          }
}

class Employee
{
         int eid;
         String ename;

         public void display()
         {
              System.out.println("eid: "+eid);
              System.out.println("ename: "+ename);
         }
}

