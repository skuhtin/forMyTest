package forMyTest.fromVova;

import java.util.List;
import java.util.ArrayList;
public class alphabet
{
    public static void main(String[] args)
    {
        String input = "asd12";
        List<Character> myList = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            myList.add((char)('a' + i));
            myList.add((char)('A' + i));
        }
        char[] tmp = input.toCharArray();
        String result = "Yes";

        for (int i = 0; i < tmp.length; i++) {
            if (!myList.contains(tmp[i])) {
                result = "No";
            }
        }

         System.out.println(result);
    }
}
