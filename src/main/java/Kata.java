public class Kata {

    public Kata() {
    }

    public String checkNumber(int number) {
        String result = String.valueOf(number);

        if (number == 5) {
            return "fizz";
        } else {
            return result;
        }
    }

    public void generateNumber(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(checkNumber(i));
        }
    }

    public void generateFromOne() {

    }

    public void run() {

    }
}
