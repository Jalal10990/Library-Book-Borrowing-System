
class Author{
    String name;
    String nationality;
    
    Author(String name, String nationality){
        this.name = name;
        this.nationality = nationality;

    }
    void displayAuthor(){
        System.out.println("Author: " + name + " (" + nationality + " )");
        
    }
}