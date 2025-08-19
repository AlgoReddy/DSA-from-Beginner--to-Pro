package recursiveStrings;

import java.util.ArrayList;

public class SubStrings {
    public static void main(String[] args) {
        String str = "abc";
        String s = "";
        subs(s, str);
        System.out.println(s);
        System.out.println(subSetReq(s, str));
        System.out.println((int) ('a'));
        seqAscii(s, str);
        System.out.println(seqAsciiRet(s, str));
    }

    static void subs(String pro, String unpro) {
        if (unpro.isEmpty()) {
            // this line controls the printing of the return value in that local recursion
            // call as we are generating a new String in each string iteration level
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        // main points to keep in mind
        // here unpro or pro they are not changing the same string in each iteration
        // they are creating a new string
        // remember String are Immutable
        subs(pro, unpro.substring(1));
        subs(pro + ch, unpro.substring(1));
    }

    // #using arrayslist to return
    static ArrayList<String> subSetReq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> right = subSetReq(p + ch, up.substring(1));
        ArrayList<String> left = subSetReq(p, up.substring(1));
        right.addAll(left);
        // here you can return any list left or right depending upon which variable you
        // are adding into it
        return right;
    }

    // #returning the asci values if it's a case along with the other 2

    static void seqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }
        char ch = up.charAt(0);
        seqAscii(p, up.substring(1));
        seqAscii(p + ch, up.substring(1));
        seqAscii(p + (ch + 0), up.substring(1));
    }
    // # returning the ascii values in the String

    static ArrayList<String> seqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);
        ArrayList<String> first = seqAsciiRet(p, up.substring(1));
        ArrayList<String> second = seqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> third = seqAsciiRet(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }

}
