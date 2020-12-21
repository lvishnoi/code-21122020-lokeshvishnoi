package com.vamstar.assesment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {

		String filePath = "data.csv";
		String line = null;
		boolean header = true;
		int lineCounter = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			long bytes = new File(filePath).length();

			System.out.print("Column Names: ");

			while ((line = br.readLine()) != null) {
				line = line.replace("\"", "");
				String values[] = line.split(",");

				for (int i = 0; i < values.length && header; i++) {
					System.out.print(values[i] + ", ");
				}
				header = false;
				lineCounter++;
			}
			br.close();
			System.out.println();
			System.out.println("Total size: " + bytes + " bytes");
			System.out.println("Total lines: " + lineCounter);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
