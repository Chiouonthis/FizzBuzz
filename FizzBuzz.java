public class FizzBuzz {

    public static void main(String[] args) {

        String fizz = "Fizz";
        String buzz = "Buzz";

        int[] fizzNums = new int[100];

        for (int i = 0; i < fizzNums.length; i++) {
            fizzNums[i] = i + 1;
        }

        for (int num : fizzNums) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(fizz + buzz);
            } else if (num % 3 == 0) {
                System.out.println(fizz);
            } else if (num % 5 == 0) {
                System.out.println(buzz);
            } else {
                System.out.println(num);
            }

        }

    }

}
