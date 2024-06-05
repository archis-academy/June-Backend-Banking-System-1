package user;

public class User {
    public int id;
    public String fullName;
    public String password;
    public String email;
    public int age;
    public  String phoneNumber;
    public  String address;

    public User(int id, String fullName, String password, String email, int age, String phoneNumber, String address){
        this.id=id;
        this.fullName=fullName;
        this.password=password;
        this.email=email;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }
}
