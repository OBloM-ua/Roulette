public class Humen {

    private int money = 10000;
    private boolean choice;


    final int max = 36;


    public int getMoney() {
        return money;
    }

    public void play(int i) {
        int nummerBefor = 0;

        for (int j = 0; j < i; j++) {
            int rnd = rnd(max);

            if (nummerBefor % 2 != 0) {
                choice = true;
                System.out.println("Попередньо випало число [" + nummerBefor +"] тому Ви ставите на парні!");
            } else {
                choice = false;
                System.out.println("Попередньо випало число [" + nummerBefor +"] тому Ви ставите на непарні!");
            }

            nummerBefor = rnd;


            if (rnd == 0) {
                money = money - 1;
            } else if (rnd % 2 == 0) { //парні
                if (choice) {
                    money = money + 1;
                    System.out.println("Випало число [" + rnd + "] Число парне, ВИ ВИГРАЛИ. Ваш рахунок " + money+ "++");
                } else {
                    money = money - 1;
                    System.out.println("Випало число [" + rnd + "] Число парне, Ви програли. Ваш рахунок " + money+ "--");
                }
            } else { //непарні
                if (!choice) {
                    money = money + 1;
                    System.out.println("Випало число [" + rnd + "] Число не парне, ВИ ВИГРАЛИ. Ваш рахунок " + money);
                } else {
                    money = money - 1;
                    System.out.println("Випало число [" + rnd + "] Число не парне, Ви програли. Ваш рахунок " + money);
                }
            }

        }
    }


    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }
}
