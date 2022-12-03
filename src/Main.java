public class Main {
    public static void main(String[] args) {
        int amount = 200;
        int payment = 800;
        int percent = (payment / 100);
        if (payment >= 1001) {
            percent = (payment / 100);
        } else {
            percent = 0;
        }
        System.out.println(amount + payment + percent);

    }
}
