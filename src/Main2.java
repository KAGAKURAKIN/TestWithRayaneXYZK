void main() {
    Scanner sc = new Scanner(System.in);
    String name, password, ans;
    int age;

    do {
        System.out.println("What is your name? ");
        name = sc.nextLine();

        System.out.println("What is your age? ");
        age = Integer.parseInt(sc.nextLine());

        if (age < 13) {
            System.out.println("you're too young to use this program");
            System.exit(0);
        }

        System.out.println("Choose a password: ");
        password = sc.nextLine();

        System.out.println("Are you sure? (yes/no) ");
        ans = sc.nextLine();

        if (!ans.equalsIgnoreCase("yes")) {
            IO.println("Re-enter the info please.\n");
        }

    } while (!ans.equalsIgnoreCase("yes"));

    System.out.println("You are " + name + " And You are " + age + " Years old.");


    sc.close();
}
