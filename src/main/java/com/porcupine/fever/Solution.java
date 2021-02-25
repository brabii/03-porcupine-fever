package com.porcupine.fever;

import java.util.List;

public class Solution {
	static int[] aliveNumbers(List<Cage> cages, int years) {
		int[] alives = new int[years];
		int sum;
		for (int i = 0; i < years; i++) {
			sum = 0;
			for (Cage cage : cages) {
				cage.setAll(cage.getAll() - cage.getSick());
				if (cage.getAll() <= 0) {
					cage.setAll(0);
					cage.setHealthy(0);
					cage.setSick(0);
				}
				cage.setSick(cage.getSick() * 2);
				sum += cage.getAll();
			}
			alives[i] = sum;
			if (sum == 0) {
				return alives;
			}
		}
		return alives;
	}
}
