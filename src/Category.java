public class Category {
    public int category_id;
    public String category_name;

    public Category(){}

    public Category(int category_id, String category_name){
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name(){
        return category_name;
    }

    public void setCategory_name(String category_name){
        this.category_name = category_name;
    }

    public void addCategory(int category_id, String category_name){
        System.out.println("ajouter un livre à une catégorie");
    }

    public void removeCategory(int category_id){
        System.out.println("supprimer un livre d'une catégorie");
    }

    public void updateCategory(int category_id, String category_name){
        System.out.println("modifier une catégorie");
    }
}
