package recursiveStrings;

public class BasicString {
    public static void main(String[] args) {
        String str = "baccappledefc";
        String s = "";
        // System.out.println(skipApple(str));
        // skip(s, str);

        // System.out.println(skipWithoutVariable(str));
        System.out.println(skipAppNotApple(str));

    }

    static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;

        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            skip(processed, unprocessed.substring(1));

        } else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }
    static String skipWithoutVariable(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return " ";

        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            return skipWithoutVariable(unprocessed.substring(1));

        } else {
            return ch + skipWithoutVariable(unprocessed.substring(1));
        }

    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));

        } else {
            return skipApple(up.substring(1)) + up.charAt(0);
        }
    }


// skips only the app whenever the apple word is not in the sentence
//it won't skip app when the word havingn apple 

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return " ";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));

        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

}
