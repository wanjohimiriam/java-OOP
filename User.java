public class User {
    private String _name;
    private String _membership;

    // encapsulation using setter
    void set_name(String name){
        _name = name;
    }

    //encapsulation using getter
    String get_name(){
        return _name;
    }

    //method overloading where one function carrys a string and the other an enum
     void set_membership(String membership){
        _membership= membership;
     }

     void set_membership(Membership membership){
        _membership= membership.name();
     }
     public enum Membership{
        Bronze, silver, gold;
     }
     String get_membership(){
        return _membership;
     }
}
