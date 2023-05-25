import java.util.ArrayList;
import java.util.List;

class OOP{

    public static void main( String args[]){

        Student mirrow = new Student();
        System.out.println(mirrow.get_verified());
        mirrow.set_membership("gold");
        System.out.println(mirrow.get_membership());


        User.admins = new ArrayList <User>();
        User.admins.add(new User("Caleb"));
        User.admins.add(new User("Miriam"));
        User.admins.add(new User("Wanjohi"));
        User.admins.add(new User("Roreen"));
        User.admins.add(new User("miko"));
        
        //User.print_data_admins();

        //generic list
        // List <User> users = new ArrayList <User>();
        // users.add(new User("Caleb"));
        // users.add(new User("Miriam"));
        // users.add(new User("Wanjohi"));
        // users.add(new User("Roreen"));
        // users.add(new User("miko"));

        // for(int i=0; i<users.size(); i++){
        //     System.out.println(users.get(i).get_name());
        // }
        
        // for(User u: users){
        //     System.out.println(u.get_name());
        // }

        // User u= new User("Miriam", "silver");
        // User u2= new User("Miriam", "silver");

        // System.out.println(u.equals(u2));

        // u.set_name ("MIRIAM");
        // u.set_membership (User.Membership.gold);

        // User u2 = new User();
        // u2.name = "WANJOHI";
        // u2.membership= "UI/UX";

        // System.out.println(u.get_name());
        // System.out.println(u.get_membership());
        // System.out.println(u2.get_membership());
        // System.out.println(u.name);
        // System.out.println(u.membership);
    }
}