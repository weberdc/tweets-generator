/*
 * Copyright 2017 Derek Weber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
