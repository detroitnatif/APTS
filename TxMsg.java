public class TxMsg {
    public String getMessage(String original) {
        // break up original words and create output array that is howeever many words
        // long
        String[] words = original.split(" ");
        String[] otpt = new String[words.length];
        // use convert method to change words based on their compostion, all vowels will
        // be left
        for (int num = 0; num < words.length; num++) {
            otpt[num] = convert(words[num]);
        }
        // join the output into a string
        return String.join(" ", otpt);

    }

    public String convert(String inpt) {
        // check if the word has any consonants, if it reaches z, return the word as is
        char[] cons = "bcdfghjklmnpqrstvwxyz".toCharArray();
        for (char i : cons) {
            if (inpt.contains(String.valueOf(i))) {
                // break stops this loop and moves onto the next loop
                break;
            }
            if (i == 'z') {
                return inpt;
            }
        }
        // taking the given word, loop through it and append the first letter if it is
        // not a consonant
        StringBuilder s = new StringBuilder();
        for (int k = 0; k < inpt.length(); k++) {
            if (k == 0 && !isvowel(inpt.charAt(0))) {
                s.append(inpt.charAt(k));
                // continue skips this iteration of the loop after appending the first letter.
                continue;
                // if the first letter is a vowel just skip appending it to the result
            } else if (k == 0) {
                continue;
            }
            // if the letter is a consonant and the letter before is a vowel append it
            if (isvowel(inpt.charAt(k - 1)) && !isvowel(inpt.charAt(k))) {
                s.append(inpt.charAt(k));
            }

        }
        return s.toString();

    }

    public boolean isvowel(char j) {
        if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getMessage("i love dogs"));
    }

}
