// A Book class with multiple constructors (title only, title+price).
public class Book {
  String name ;
  int price;

    public Book() {
      name ="Atomic habit";
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void display(){
      System.out.println(name+" = "+price);
    }
    
  public static void main(String[] args) {
    Book book = new Book();
    Book book2= new Book("Rich Dad Poor Dad", 499);
    book.price = 399;
    book.display();
    book2.display();
  }
  
}
