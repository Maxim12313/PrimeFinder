public class PrimeFinderRoot extends PrimeFinder{

    @Override
    public boolean isPrime(int number) { //checkes primes by dividing all smaller numbers up to square root


        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { //checks if divisable
                //System.out.println(number + " divisable by " + i);
                return false;
            }
        }
        return true;
    }
    public String getName(){
        return "PrimeFinderRoot";
    }



}
