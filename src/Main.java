
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ost = 100;
        int amount = 1200;
        int bonus = amount / 100;
        int sum;
        if (amount >= 1000) {
            sum = bonus + amount + ost;
        } else {
            sum = amount + ost;
        }
        System.out.println("Итого на счете:" + sum);
        if (amount >= 1000) {
            System.out.println("Начислено бонусов:" + bonus);
        } else {
            System.out.println("Начислено бонусов: 0");
        }
    }
}