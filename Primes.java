public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] IsPrime = new boolean[n+1];
            for(int i = 0; i < IsPrime.length; i++){
            IsPrime[i] = true;
            }
        IsPrime[0] = false;
        IsPrime[1] = false;
            for(int i = 2; i <=Math.sqrt(n*1.0); i++){
                if(IsPrime[i] == true){
                    for(int j = i+i; j < n+1; j = j+i){
                        IsPrime[j] = false;
                    }
                }
            }
        int counter = 0;
        System.out.println("Prime numbers up to " + n + ":");
            for(int i = 0; i < IsPrime.length; i++){
                if (IsPrime[i] == true){
                    counter++;
                    System.out.println(i);
                }
            }
    double totalNumbers = n;
    double percentage = (counter / totalNumbers) * 100.0;
    System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes).%n", counter, n, percentage);
    }
}