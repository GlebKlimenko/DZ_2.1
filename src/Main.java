public class Main {

    public static void main(String[] args) {
        float remains = 100;
        System.out.println("Ваш остаток на счёте " + remains + " рублей, Внесите платёж");
        float payment = 2000;
        int bonus = 0;
        float balanse = 0;

        if (payment >= 1000) {
            bonus = (int) payment / 100;
            balanse = remains + payment + bonus;
        } else {
            balanse = remains + payment;
        }
        System.out.println("Ваш бонус " + bonus + " рублей");
        System.out.println("Итого на вашем счету " + balanse + " рублей");
    }
}