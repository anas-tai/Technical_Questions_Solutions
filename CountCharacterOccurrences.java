public class CountCharacterOccurrences {
    public static int countCharacter(String input, char targetChar) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
        char target1 = 'e';
        int result1 = countCharacter(input1, target1);
        System.out.println("Count of " + target1 + " in " + input1 + ": " + result1);

        String input2 = "abccdefgaa";
        char target2 = 'a';
        int result2 = countCharacter(input2, target2);
        System.out.println("Count of " + target2 + " in " + input2 + ": " + result2);
    }
}
