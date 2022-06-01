import static java.lang.System.currentTimeMillis;

public class Main {

    static void timeTest(PrimeFinder primefinder){ //takes a primefinder and tests its functions, tracks time also
        long start = currentTimeMillis();
        int test = 37;
        int limit = 100;
        if (primefinder.isPrime(test)) {
            System.out.println(test+ " is apparently prime");
        } else {
            System.out.println(test+ " is not a prime number");
        }

        System.out.println("Primefinder: "+ primefinder.getName());
        System.out.println("Limit: " + limit);
        System.out.println("Primes: "+ primefinder.countPrimes(limit));
        System.out.println("Time: "+ (currentTimeMillis()-start) +" Miliseconds");
        System.out.println("--------------------------------------------------");
    }



    public static void main(String[] args) {

        timeTest(new PrimeFinderAll());
        timeTest(new PrimeFinderHalf());
        timeTest(new PrimeFinderRoot());
        timeTest(new PrimeFinderSieve(100));







    }





}
