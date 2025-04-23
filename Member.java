class Member {
    String name;
    int memberId;
    Book borrowedBook;
    //can borrow only one book at a time HAS A relatiionship
    Member(String name, int memberId){
        this.name =name;
        this.memberId = memberId;
        this.borrowedBook = null;

    }

    public boolean hasBorrowedBook(){
        return borrowedBook != null;
    }
    void displayMember(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
        if(borrowedBook != null){
            System.out.println("Borrowed Book Info:");
            borrowedBook.displayBook();
        }else{
            System.out.println("No book borrowed.");
        }
    }
}
