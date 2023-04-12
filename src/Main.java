public class Main {
    public static void main(String[] args) {
        Numbers numberList = new Numbers();
        String[] arrayOfNumbers = {"2956557011","22709","177290649","1483846401",
                "3000012541","63083986","7079","1","2","1", "priemgetal"};
        Long primeNumber = numberList.isPrime(arrayOfNumbers);
        System.out.println(primeNumber);
    }
}