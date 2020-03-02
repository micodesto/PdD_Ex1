public class Kata {

    public Kata() {
    }

    public String checkNumber(int number) {

        if (number == 5) {
            return "fizz";
        } else {
            return String.valueOf(number);
        }
    }

    public void generateNumber(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.println(checkNumber(i));
        }
    }

    public void generateFromOne() {

    }

    public void run() {
        generateNumber(60);
    }
}
