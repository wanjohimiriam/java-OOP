class OOP{

    public static void main( String args[]){
        User u= new User("Miriam", "silver");
        User u2= new User("Miriam", "silver");

        System.out.println(u.equals(u2));

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