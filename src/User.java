public class User {
    public int user_id;
    public String name;
    public String surname;
    public int phone_number;
    public String email;

    public User(){}

    public User(int user_id, String name, String surname, int phone_number, String email){
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.email = email;
    }

    public int getUser_id(){
        return user_id;
    }

    public void setUser_id(int user_id){
        this.user_id = user_id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getPhone_number(){
        return phone_number;
    }

    public void setPhone_number(int phone_number){
        this.phone_number = phone_number;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void addUser(int user_id, String name, String surname, int phone_number, String email){
        System.out.println("ajouter un utilisateur");
    }
    public void removeUser(int user_id){
        System.out.println("supprimer un utilisateur");
    }

    public void updateUser(int user_id, String name, String surname, int phone_number, String email){
        System.out.println("modifier un utilisateur");
    }
}
