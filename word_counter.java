import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class word_counter {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence or file name
        System.out.println("Enter a sentence or file name:");
        String input = scanner.nextLine();

        // Check if the input is a sentence or a file name
        if (input.contains(" ")) {
            // Count the number of words in the sentence
            String[] words = input.split(" ");
            int wordCount = words.length;

            // Print the word count
            System.out.println("The sentence has " + wordCount + " words.");
        } else {
            // Read the file
            File file = new File(input);
            Scanner fileScanner = new Scanner(file);

            // Count the number of words in the file
            int wordCount = 0;
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            // Print the word count
            System.out.println("The file has " + wordCount + " words.");
        }
    }
}