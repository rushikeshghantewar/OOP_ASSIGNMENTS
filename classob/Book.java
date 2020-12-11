package RoughWork;
class Book
{
int b_id;
String name;
float price;



Book(int id,String n,float p )
{
this.b_id=id;
this.name=n;
this.price=p;


}






void Display()
{
System.out.println("Book id is:"+b_id);
System.out.println("name of book is:"+name);
System.out.println("price of book is:"+price);

}




}

class BookDemo
{

public static void main(String []args)
{
    Book b=new Book(101,"Abc",203);
    Book b1=new Book(102,"kjk",545);
     Book b2=new Book(103,"hh",540);
      Book b3=new Book(104,"kjk",1235);
       Book b4=new Book(105,"kjk",205);
       
//       b.Display();
//       b1.Display();
//       b2.Display();
//       b3.Display();
//       b4.Display();
       
       
      
    }
    
}
       
       
 