public class Main {
    public static void main(String[] args) {
        
LibraryManager2 manager = new LibraryManager2();

//create author
Author author1 = manager.createAuthor("Jalal", "Pkistani");

//create book
Book book1 = manager.createBook("Java", "9", 4, author1);

//registration member
Member member1 = manager.registerMember("Ali", 12);

//Borrow book
manager.borrowBook(member1, book1);

//display details
manager.displayMemberDetails(member1);

//return book
manager.returnBook(member1);

//display after returning
manager.displayMemberDetails(member1);




    }
}
