import java.util.Scanner;

public class HomeBudget {
    public static final int ADD_INCOME = 0;
    public static final int ADD_EXPENSE = 1;
    public static final int SHOW_INCOME = 2;
    public static final int SHOW_EXPENSE = 3;
    public static final int EXIT = 4;

    public static void main(String[] args) {
        System.out.println("app.Home_budget v0.1");
        Scanner scan = new Scanner(System.in);
        Income[] income = new Income[3];
        Expension[] expensions = new Expension[3];
        int incomeNumber = 0;
        int expensionNumber = 0;

        int option = 0;

        do {
            System.out.println("Wybierz opcję");
            System.out.println(ADD_INCOME + " dodaj przychód");
            System.out.println(ADD_EXPENSE + " dodaj wydatek");
            System.out.println(SHOW_INCOME + " wyświetl przychody");
            System.out.println(SHOW_EXPENSE + " wyświetl wydatki");
            System.out.println(EXIT + " koniec programu");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case ADD_INCOME:

                    Item[] Income = new Income[3];
                    System.out.println("Podaj Przychód");
                    Income[incomeNumber].setDescription(scan.nextLine());
                    System.out.println("Podaj kwotę");
                    Income[incomeNumber].setAmout(scan.nextInt());
                    System.out.println("Podaj datę");
                    Income[incomeNumber].setDate(scan.nextLine());
                    scan.nextLine();
                    incomeNumber++;
                    break;
                case ADD_EXPENSE:
                    Item[] Expension = new Expension[3];
                    System.out.println("Podaj wydatek");
                    Expension[expensionNumber].setDescription(scan.nextLine());
                    System.out.println("Podaj kwotę");
                    Expension[expensionNumber].setAmout(scan.nextInt());
                    scan.nextLine();
                    System.out.println("Podaj datę");
                    Expension[expensionNumber].setDate(scan.nextLine());
                    scan.nextLine();
                    expensionNumber++;
                    break;
                case SHOW_INCOME:
                    for (Income incomes : income) {
                        if (incomes != null) {
                            String opis = income.show();
                            System.out.println(opis);
                        }
                    }
                    break;
                case SHOW_EXPENSE:
                    for (int i = 0; i < expensionNumber; i++) {
                        String opis = shows[i].show();
                        System.out.println(opis);
                    }
                    break;

            }
        } while (option != EXIT);

        System.out.println("Bye bye");
    }
}

