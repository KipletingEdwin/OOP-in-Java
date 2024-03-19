//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "Caleb";
        user1.membership = "Gold";


        User user2 = new User();
        user2.name = "Sally";
        user2.membership = "Silver";


        System.out.println(user1.name);
        System.out.println(user2.name);
        System.out.println(user1.membership);
        System.out.println(user2.membership);
        System.out.println(user1.age);


    }
}