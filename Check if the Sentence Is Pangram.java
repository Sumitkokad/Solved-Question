/*A pangram is a sentence where every letter of the English alphabet appears at least once.*/


class Main {
    // Method to check if a sentence is a pangram (contains all 26 lowercase letters)
    public boolean checkIfPangram(String sentence) {
        // Boolean array of size 26 to track if each letter 'a' to 'z' is present
        boolean temp[] = new boolean[26];
        // Variable to count unique letters found
        int count = 0;

        // Loop through each character of the input sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); // Get the character at index i

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Convert character to index (0 for 'a', 1 for 'b', ..., 25 for 'z')

                // If the letter is found for the first time
                if (!temp[index]) {
                    temp[index] = true; // Mark this letter as found
                    count++; // Increment the unique letter count
                }
            }

            // If all 26 letters are found, return true immediately
            if (count == 26) {
                return true;
            }
        }
        // If all characters are processed and not all 26 letters are found, return false
        return false;
    }

    // Main method to test the function
    public static void main(String args[]) {
        Main obj = new Main(); // Create an instance of the Main class

        String str = "thequickbrownfoxjumpsoverthelazydog"; // Test pangram string
        System.out.println(obj.checkIfPangram(str)); // Output: true
    }
}
