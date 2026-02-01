void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your username: ");
    String username = sc.nextLine();

    System.out.println("Please enter your password: ");
    String password = sc.nextLine();

    System.out.println("Please enter your age: ");
    int age = Integer.parseInt(sc.nextLine());

    System.out.print("Is this information correct? (yes/no): ");
    String ans = sc.nextLine();

    if (ans.equalsIgnoreCase("yes")) {
        System.out.println("Your name is " + username + " and you're " + age + " years old.");
    } else {
        System.out.println("Re-enter your information.");

        System.out.println("Please enter your username: ");
        username = sc.nextLine();

        System.out.println("Please enter your password: ");
        password = sc.nextLine();

        System.out.println("Please enter your age: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Your name is " + username + " and you're " + age + " years old.");
    }

    sc.close();
}
