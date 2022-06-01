public class PrimeFinderHalf extends PrimeFinder {

    @Override
    public boolean isPrime(int number) { //checkes primes by dividing by half the numbers smaller


        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) { //checks if divisable
                //System.out.println(number + " divisable by " + i);
                return false;
            }
        }
        return true;
    }
    public String getName(){
        return "PrimeFinderHalf";
    }



}
