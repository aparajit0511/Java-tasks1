import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Person person1 = new Person("aparajit",29);
        Person person2 = new Person("puppy",5);
        person1.display();
        person2.display();

        System.out.println("Dog class");

        Dog dog = new Dog("puppy","labrador");
        System.out.println("Dog's name is " + dog.getName() + " Of breed " + dog.getBreed());
        dog.setName("Courage");
        dog.setBreed("beagle");
        System.out.println("Dog's name is " + dog.getName() + " Of breed " + dog.getBreed());

        System.out.println("Book class");

        Book book1 = new Book("Harry Potter","JK Rowling","226016");
        Book book2 = new Book("The Alchemist","Paul Coelho", "556016");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();

        for(Book book: bookCollection){
            System.out.println("Book is " + book.getTitle() + " by " + book.getAuthor() + " with ISBN "+ book.getIsbn());
        }

    }
}