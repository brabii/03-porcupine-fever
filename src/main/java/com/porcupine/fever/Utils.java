package com.porcupine.fever;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Utils {

	private Utils() {

	}

	static List<Cage> getCagesFromFile(String pathname) {
		List<Cage> cages = new ArrayList<Cage>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(pathname)));
			String line;
			while ((line = br.readLine()) != null) {
				String[] array = line.split(" ");
				Cage cage = new Cage(Integer.parseInt(array[0]), Integer.parseInt(array[1]),
						Integer.parseInt(array[2]));
				cages.add(cage);
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return cages;
	}
}
