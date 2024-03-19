public class User {
    String _name;
    private String _membership;


//    public  User() {
//
//    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }


    void  set_name(String name) {
        System.out.println("Logging to log file");
        _name = name;
    }

    void set_membership(String membership){
        _membership = membership;
    }

    String get_membership(){
        return  _membership;
    }

    void  set_membership(Membership membership){
        _membership = membership.name();

    }

    public enum Membership {
        Bronze,Silver, Gold;
    }


    String get_name() {
        return _name;
    }







}
