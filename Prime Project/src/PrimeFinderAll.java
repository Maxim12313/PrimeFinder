public class PrimeFinderAll extends PrimeFinder {

    @Override
    public boolean isPrime(int number) { //checks primes by dividing by all smaller numbers


        for (int i = 2; i < number; i++) {
            if (number % i == 0) { //sees if divisable
                //System.out.println(number+" divisable by "+ i);
                return false;
            }
        }
        return true;
    }

    public String getName(){
        return "PrimeFinderAll";
    }



}


