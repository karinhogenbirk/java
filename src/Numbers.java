import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numbers {
    public Long isPrime(String[] arrayOfNumbers) {

        //create two empty arrays
        ArrayList<Long> listOfNumbers = new ArrayList<>();
        ArrayList<Long> result = new ArrayList<>();

        //Loop to create array of numbers
        try {
            for (String number : arrayOfNumbers) {
                long parsedNumber = Long.parseLong(number);
                listOfNumbers.add(parsedNumber);
            }
        } catch (Exception e) {
            System.out.println("This is not a number");
        }


        //New loop to check prime numbers
        for (long number : listOfNumbers) {
            for (long i = 2; i < number; i++) {
                if (number < 1) {
                    break;
                }
                if (number % i == 0) {
                    result.add(number);
                    break;
                }
            }
        }

        for (int i = 0; i < result.size(); i++) {
            long primeNumber = result.get(i);
            System.out.println(primeNumber);
        }
        return null;

    }
}

