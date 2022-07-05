public class Main {
    public static void main(String[] args) {

        int InitialAccount = 7_500;
        int payment = 420;
        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = InitialAccount + payment + bonus;
        System.out.println("На счете : " + finalAccount);
        System.out.println("Бонус : " + bonus);
    }
}