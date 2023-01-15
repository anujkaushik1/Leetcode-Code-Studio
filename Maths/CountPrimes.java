

//SEIVE OF ERATOSTHENES => 

class Solution {
    public int countPrimes(int n) {
        boolean arr[] = new boolean[n + 1];  // indexing 0 se start and convenience ke liye start from 1

        Arrays.fill(arr, true);
        int count = 0;
        for(int i = 2; i < n; i++){

            if(arr[i] == true){
                count++;

                for(int j = 2 * i; j < n; j = j + i){
                    arr[j] = false;
                }

            }

        }  
        return count;  
    }

}

//time -> o(n*n)
// space -> o(1)

class Solution {
    private boolean isPrime(int n){

        for(int i = 2; i < n; i++){

            if(n % i == 0)
                return false;

        }

        return true;

    }
    public int countPrimes(int n) {

        int count = 0;

        for(int i = 2; i < n; i++){

            if(isPrime(i))
                count++;

        }

        return count;
        
    }
}
