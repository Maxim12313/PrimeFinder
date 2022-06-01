public class PrimeFinderSieve extends PrimeFinder{

    private boolean[] primes;

    public PrimeFinderSieve(int limit){ //constructor taking a limit, holds an array of booleans, primes being true

        this.primes = new boolean[limit+1];
        //creates array of true booleans
        for (int n=2;n<primes.length;n++){
            primes[n] = true;
        }

        for(int i=2; i<=Math.sqrt(limit);i++){ //goes through array of true booleans making false by the sieve method
            for (int o=i*2; o<=limit;o+=i){
                primes[o]=false;
            }
        }
    }

    @Override
    public boolean isPrime(int number){ //checks if the boolean at the index number is true
        return primes[number];
    }

    public int countPrimes(int limit) { //counts the total number of primes in the given limit
        int count = 0;
        for (int i=2;i<primes.length;i++){
            //System.out.println(i+" - "+primes[i]);
            if (primes[i]) { //true = prime
                count++;
            }
        }
        return count;
    }

    public String getName(){
        return "PrimeFinderSieve";
    }









}
