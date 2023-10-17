public class panagram {
    public static boolean isPangram(String str) {
        boolean[] alphabetPresent = new boolean[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ('a' <= c && c <= 'z') {
                int index = c - 'a'; 
                alphabetPresent[index] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(inputString);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
