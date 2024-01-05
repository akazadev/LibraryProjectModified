public class Book {
    public int book_id;
    public int ISBN;
    public String title;
    public String author;
    public String cathegory_id;

    public Book(){}
    public Book(int book_id, int ISBN, String title, String author, String cathegory_id){
        this.book_id = book_id;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.cathegory_id = cathegory_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getCathegory_id() {
        return cathegory_id;
    }

    public void setCathegory_id(String cathegory_id){
        this.cathegory_id = cathegory_id;
    }

    //add book method

    public void addBook(int book_id, int ISBN, String title, String author, String cathegory_id){
        System.out.println("ajouter un livre");
    }

    //remove book method
    public void removeBook(int book_id){
        System.out.println("supprimer un livre");
    }

    //update book method
    public void updateBook(int book_id, int ISBN, String title, String author, String cathegory_id){
        System.out.println("modifier un livre");
    }

}
