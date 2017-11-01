package org.dcw.twitter.util;

import java.util.Random;

/**
 * Pseudorandom number generator based on Donald Knuth's Poisson distribution
 * algorithm.
 *
 * @see  <a href="https://stackoverflow.com/questions/2206199/how-do-i-generate-discrete-random-events-with-a-poisson-distribution">java - How do I generate discrete random events with a Poisson distribution? - Stack Overflow</a>
 */
public class PoissonGenerator {
    private static final Random RANDOM = new Random();

    /**
     * Psuedorandom number generator, based on Donald Knuth's Poisson
     * distribution algorithm.
     *
     * @param mean The mean around which the returned value will hover.
     * @return A pseudorandom number, part of a series that has a mean of <code>mean</code>.
     * @see <a href="https://stackoverflow.com/questions/2206199/how-do-i-generate-discrete-random-events-with-a-poisson-distribution">java - How do I generate discrete random events with a Poisson distribution? - Stack Overflow</a>
     */
    public static int getNext(final double mean) {
        final double L = Math.exp(-mean);
        int k = 0;
        double p = 1.0;
        do {
            p = p * RANDOM.nextDouble();
            k++;
        } while (p > L);
        return k - 1;
    }
}
