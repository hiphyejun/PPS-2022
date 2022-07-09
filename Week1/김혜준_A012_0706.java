 class Solution {
    public int countPrimes(int n) {
        // 숫자들을 t/f로 배열에 저장해둔다.
        boolean[] isMultipleOfPrime = new boolean[n]; 
        
        // count of prime nums so far
        int count = 0;
        
        for (int i = 2; i < n; i++) {     // 1은 소수가 아니라서 2부터 시작한다.
            if (!isMultipleOfPrime[i]) {  // if i not dividable by a previous num, it's a prime
                count++;                  // count toward total num of primes seen so far
                for (int j=i; j<n; j=j+i) // mark all multiples of i as non-prime
                    isMultipleOfPrime[j] = true;
            }
        }
        return count;
    }   
}