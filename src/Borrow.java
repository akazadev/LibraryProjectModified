public class Borrow {
    public int borrow_id;
    public int user_id;
    public int book_id;
    public String borrow_date;
    public String return_date;

    public Borrow(){}

    public Borrow(int borrow_id, int user_id, int book_id, String borrow_date, String return_date){
        this.borrow_id = borrow_id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
    }

    public int getBorrow_id(){
        return borrow_id;
    }

    public void setBorrow_id(int borrow_id){
        this.borrow_id = borrow_id;
    }

    public int getUser_id(){
        return user_id;
    }

    public void setUser_id(int user_id){
        this.user_id = user_id;
    }

    public int getBook_id(){
        return book_id;
    }

    public void setBook_id(int book_id){
        this.book_id = book_id;
    }

    public String getBorrow_date(){
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date){
        this.borrow_date = borrow_date;
    }

    public String getReturn_date(){
        return return_date;
    }

    public void setReturn_date(String return_date){
        this.return_date = return_date;
    }

    public void addBorrow(int borrow_id, int user_id, int book_id, String borrow_date, String return_date){
        System.out.println("ajouter un emprunt");
    }

    public void removeBorrow(int borrow_id){
        System.out.println("supprimer un emprunt");
    }

    public void updateBorrow(int borrow_id, int user_id, int book_id, String borrow_date, String return_date){
        System.out.println("modifier un emprunt");
    }
}
