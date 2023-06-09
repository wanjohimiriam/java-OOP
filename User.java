import java.util.List;

public class User {
    private String _name;
    private String _membership = "bronze";

    //static data members
    static List <User> admins;

    public static void print_data_admins(){
      for(User u: admins){
         System.out.println(u.get_name());
     }
    }

   //method overriding
   public String toString(){
      return get_name() + " "+ get_membership();
   }


   //overiding equals
   public boolean equals(User u2){
      if (get_name() == u2.get_name() 
      && get_membership()== u2.get_membership()){
         return true;
      }else{
         return false;
      }
   }

    //constructors
    public User(String name) {
      set_name(name);
      //set_membership(membership);
    }

    public User() {
      
   }

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
