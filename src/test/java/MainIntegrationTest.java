import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.davcd.wordsfrequency.Main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainIntegrationTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}
	
	@Test
	void givenEmptyString_whenWordsFrequency_thenReturnEmptyMap() throws IOException {
		Main.main();
		assertEquals(Files.readString(Path.of("src", "test", "resources", "expected.log"), StandardCharsets.UTF_8), outContent.toString());
	}
	
}
