abstract class PrimeFinder {


    public abstract boolean isPrime(int number); //prime finder function

    public abstract String getName(); //name function


    public int countPrimes(int limit) { //inherited count primes function
        //counts the primes up to the limit using the primefinder function
        int num = 0;
        for (int d = 2; d <= limit; d++) {
            if (isPrime(d)) {
                num++;
            }
        }
        return num;
    }





}








