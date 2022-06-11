# Words Frequency

## Definition

"word" meaning:

> A single distinct meaningful element of speech or writing, used with others (or sometimes alone) to form a sentence and typically shown with a space on either side when written or printed.

- Meaningful element of speech or writing: It is not possible for a program to determine if a set of characters has meaning without using NLP technologies.
- Typically shown with a space on either side: But is not required

## Context

The context of this program is to process documents that contain correct English sentences (ie Wikipedia articles).
We should not find strange things like:
- test123
- @-1-test[]--
- t_e_s_t

## Approach

Following a KISS approach, we will consider every word that contains one or more letters, regardless of whether they are followed or preceded by a space.
We are taking into account the 'ʻ- characters which are very popular in English.
Also, every type of letter accents are supported!

## Solution

### Considerations

- The entire string to analyze could be loaded in memory.
- We don't need to order words by popularity.

### Technology

We will use Java and Gradle for solve this exercise.
The solution is the WordsUtils.wordsFrequency(String) function.
We will use Java Streams for performing the needed operation and the result will be stored in a HashMap (no order).

### Run

Modify `/src/main/resources/article.txt` file with your desired string

`./gradlew run`

### Test

`./gradlew test`

## Conclusions

We can verify that the most popular words in English are determiners followed by prepositions.

## Following steps

- Wrap the function correctly in a dependency
- Watch for more edge cases
- Return a TreeMap already ordered if the use case requires the most used words.
