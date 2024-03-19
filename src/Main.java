//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.set_name("Sally");
        user1.membership = "Gold";



        System.out.println(user1.get_name());
        System.out.println(user1.membership);
    }
}