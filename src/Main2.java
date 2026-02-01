void main() throws InterruptedException {
    int fave_num = 4;

    if (fave_num == 4) {
        while (fave_num < 100) {
            System.out.println(fave_num);
            fave_num += 4;
            Thread.sleep(400);
            }
        } else  {
        System.out.println("Fave number is not 4");
        }
}
