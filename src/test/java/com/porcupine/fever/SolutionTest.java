package com.porcupine.fever;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testOneSickInCage() {
		int years = 3;
		Cage cage1 = new Cage(2, 118, 120);
		Cage cage2 = new Cage(0, 50, 50);
		List<Cage> cages = Arrays.asList(cage1, cage2);
		int[] expectedAlives = { 168, 164, 156 };
		assertTrue(Arrays.equals(expectedAlives, Solution.aliveNumbers(cages, years)));
	}

	@Test
	public void testNoPorcupines() {
		int years = 1;
		List<Cage> cages = new ArrayList<Cage>();
		int[] expectedAlives = { 0 };
		assertTrue(Arrays.equals(expectedAlives, Solution.aliveNumbers(cages, years)));
	}

	@Test
	public void testOneCageGoesExtinct() {
		int years = 3;
		Cage cage1 = new Cage(2, 16, 18);
		Cage cage2 = new Cage(6, 8, 14);
		Cage cage3 = new Cage(0, 50, 50);

		List<Cage> cages = Arrays.asList(cage1, cage2, cage3);
		int[] expectedAlives = { 74, 62, 54 };
		assertTrue(Arrays.equals(expectedAlives, Solution.aliveNumbers(cages, years)));
	}
}
