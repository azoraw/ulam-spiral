package com.azoraw;

import java.util.Arrays;

import static com.azoraw.UlamSpiral.IMG_SIDE_SIZE;

public class Prime {

    private boolean[] primes;

    public Prime() {
        createPrimesBySieveOfEratosthenes();
    }

    public boolean isPrime(int n) {
        return primes[n];
    }

    private void createPrimesBySieveOfEratosthenes() {
        primes = new boolean[(IMG_SIDE_SIZE) * (IMG_SIDE_SIZE + 1) + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
            }
        }
    }


}
