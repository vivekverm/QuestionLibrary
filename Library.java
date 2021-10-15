import java.util.Scanner;
interface Libraryuser
{

    public void Account();
    public void Book();
}

 class Kiduser implements Libraryuser
 {
     int Age;
     String BookType;
     Kiduser()
     {
         Scanner s=new Scanner(System.in);
         Age=s.nextInt();
         Scanner a=new Scanner(System.in);
         BookType=a.next();
     }

     public void Account() {
         if (Age < 12)
         {
             System.out.println("You have successfully register in Kid Account");
         } else
         {
             System.out.println("Sorry,Age must be more than 12 to register as kid");
         }
     }
     public void Book()
     {
         if(BookType.equals("Kid"))
         {
             System.out.println("Book issued successfully, please return the book within 10 days");
         }
         else
         {
             System.out.println("Opps, you are allowed to take only kid book");
         }
     }
 }
 class Adult implements Libraryuser
 {     int Age;
     String BookType;
     Adult()
     {
         Scanner b=new Scanner(System.in);
         Age=b.nextInt();
         Scanner c=new Scanner(System.in);
         BookType=c.next();
     }
     public void Account()
     {
         if(Age>12)
         {
             System.out.println("You have successfully register in Adult Account");
         }
         else
         {
             System.out.println("Sorry,Age must less than 12 to register as Adult Account");
         }
     }
     public void Book()
     {
         if(BookType.equals("Fiction"))
         {
             System.out.println("Book issued successfully,please return in within 10 day ");
         }
         else
         {
             System.out.println("Opps, you are allowed to take only AdultFiction book");
         }
     }

 }
 class LibraryInterfaceDemo
 {
     public static void main(String[] args)
     {
         Kiduser obj=new Kiduser();
         obj.Account();
         obj.Book();
         Adult obj1=new Adult();
         obj1.Account();
         obj1.Book();
     }
 }
