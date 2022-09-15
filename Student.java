class Student
{
        String name;
        Sting address;
      public static void main(String arg[])
      {
         
     }
      //ticket no-122
      public void getData()
      {
         Scanner sc=new Scanner(System.in);
         name=System.out.println("Enter name");
		 name=sc.next();
		 System.out.println("Enter Address");
		 address=sc.next();
     
       }
 
      //ticket no- 322

      void displayInfo()
      {
 
         System.out.println("Student Name="+ name);
         System.out.pritnln("Address="+address);
      }

     //ticket no-433
       void calGrade(int totalMarks)
       {
        
            totalMarks>440?System.out.println("A"):System.out.println("B")
          
        }

 }
