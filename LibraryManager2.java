class LibraryManager2 {
    
    public Author createAuthor(String name, String natioanlity){
return new Author(name, natioanlity);
    }
    public Book createBook(String title, String isbn, int copies, Author author){
        return new Book(title, isbn, copies, author);

    }
    public Member registerMember(String name, int memberId){
        return new Member(name, memberId);
    }

    public Member borrowBook(Member member, Book book){
if(member.hasBorrowedBook()){
    System.out.println("This member has already borrowed a book.");

}else if(!book.isAvailable()) {
    System.out.println("Book not available at the moment.");

}else{
    member.borrowedBook = book;
    book.borrowCopy();
    System.out.println("Book issued successfully.");
}
return member;
}
public void returnBook(Member member){
    if(member.hasBorrowedBook()){
        member.borrowedBook.returnCopy();
        System.out.println("Book returned successfully: " + member.borrowedBook.title);
        member.borrowedBook = null;
    }else{
        System.out.println("No book to return.");
    }

}
public void displayMemberDetails(Member member) {
    System.out.println("---- Member Details ----");
    member.displayMember();
}
}
