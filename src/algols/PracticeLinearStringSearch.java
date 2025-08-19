package algols;

public class PracticeLinearStringSearch {
    public static void main(String[] args) {

        String str = "Amma";

        char target = 'k';
        System.out.println(stringSearch(str, target)); 
    }

    static boolean stringSearch(String str, char Target) {
        for (int i = 0; i < str.length(); i++) {
            if (Target == str.charAt(i)) {
                return true;

            }
        }
        return false;
    }

}
