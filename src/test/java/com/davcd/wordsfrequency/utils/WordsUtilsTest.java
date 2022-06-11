package com.davcd.wordsfrequency.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.davcd.wordsfrequency.utils.WordsUtils.wordsFrequency;

class WordsUtilsTest {
	
	@Test
	void givenEmptyString_whenWordsFrequency_thenReturnEmptyMap() throws IOException {
		String string = "";
		Map<String, Long> expected = new TreeMap<>();
		
		assertEquals(wordsFrequency(string), expected);
	}
	
	@Test
	void givenWeirdString_whenWordsFrequency_thenReturnCorrectMap() throws IOException {
		String string = "1fff234, @a123, _hey[]__b||";
		Map<String, Long> expected = new TreeMap<>();
		expected.put("fff", 1L);
		expected.put("a", 1L);
		expected.put("hey", 1L);
		expected.put("b", 1L);
		
		assertEquals(wordsFrequency(string), expected);
	}
	
	@Test
	void givenSentence_whenWordsFrequency_thenReturnCorrectMap() throws IOException {
		String string = "This is a valid sentence. This should be working fine :). Isn't open-source hawaiʻian çáśílläs";
		Map<String, Long> expected = new TreeMap<>();
		expected.put("this", 2L);
		expected.put("is", 1L);
		expected.put("a", 1L);
		expected.put("valid", 1L);
		expected.put("sentence", 1L);
		expected.put("should", 1L);
		expected.put("be", 1L);
		expected.put("working", 1L);
		expected.put("fine", 1L);
		expected.put("isn't", 1L);
		expected.put("open-source", 1L);
		expected.put("hawaiʻian", 1L);
		expected.put("çáśílläs", 1L);
		
		assertEquals(wordsFrequency(string), expected);
	}
	
}
