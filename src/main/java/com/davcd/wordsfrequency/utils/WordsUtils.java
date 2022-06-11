package com.davcd.wordsfrequency.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class WordsUtils {
	
	public static Map<String, Long> wordsFrequency(String string) {
		return Arrays.stream(string.toLowerCase().split("[^\\p{L}'ʻ-]"))
				.filter(o -> !o.isEmpty() && !o.replaceAll("['ʻ-]", "").isEmpty())
				.collect(groupingBy(Function.identity(), Collectors.counting()));
	}
	
	public static void printWordsByOrder(Map<String, Long> map) {
		System.out.println("Printing an ordered list of words in a given string:");
		map
				.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}
}
