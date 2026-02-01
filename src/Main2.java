import java.util.Scanner;



public static String Name(Scanner sc) {

        System.out.println("What is your name? ");
        return sc.nextLine();
}

public static int Age(Scanner sc) {
    while(true){
        System.out.println("What is your age? ");
        String input = sc.nextLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid age");
        }
    }
}

public static String Password(Scanner sc) {
        System.out.println("What is your password? ");
        return sc.nextLine();
}

Scanner sc = new Scanner(System.in);

void main() {

    String name, password, ans;
    int age;

    do {

        name = Name(sc);

        age = Age(sc);

        if (age < 13) {
            System.out.println("you're too young to use this program");
            System.exit(0);
        }

        password = Password(sc);

        System.out.println("Are you sure? (yes/no) ");
        ans = sc.nextLine();

        if (!ans.equalsIgnoreCase("yes")) {
            System.out.println("Re-enter the info please.\n");
        }

    } while (!ans.equalsIgnoreCase("yes"));

    System.out.println("You are " + name + " And You are " + age + " Years old.");


    sc.close();
}

