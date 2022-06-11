package com.davcd.wordsfrequency;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;

import static com.davcd.wordsfrequency.utils.Constants.FILE_PATH;
import static com.davcd.wordsfrequency.utils.WordsUtils.printWordsByOrder;
import static com.davcd.wordsfrequency.utils.WordsUtils.wordsFrequency;


public class Main {
	
	public static void main(String... args) throws IOException {
		String string = Files.readString(FILE_PATH, StandardCharsets.UTF_8);
		Map<String, Long> map = wordsFrequency(string);
		printWordsByOrder(map);
	}
}
