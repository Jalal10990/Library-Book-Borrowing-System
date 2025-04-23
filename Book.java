class Book {
String title;
String isbn;
int availableCopies;
Author author;

Book(String title, String isbn, int availableCopies, Author author){
    this.title = title;
    this.isbn = isbn;
    this.availableCopies = availableCopies;
    this.author = author;
    
}

public boolean isAvailable(){
    return availableCopies > 0;
}
public void borrowCopy(){
    if(isAvailable()){
        availableCopies--;
    }
}
public void returnCopy(){
    availableCopies++;
}


void displayBook(){
    System.out.println("Book Title: " + title);
    System.out.println("ISBN: " + isbn);
    System.out.println("Available Copies: " + availableCopies);
    author.displayAuthor();
}

}
