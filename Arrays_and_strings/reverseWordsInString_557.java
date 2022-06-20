package Arrays_and_strings;
import java.util.*;

/* Question link: https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/

 */
public class reverseWordsInString_557 {
    public static void main(String args[]){
        String s = "God Ding";
        String[] words = s.split(" "); //[God,Ding]
        String revStr = ""; //to store our reversed string and assigned to null

        for(int i = 0;  i < words.length; i++){ //for each word in string array
            String word = words[i];
            String revWord = "";

            //reverse each char in a word
            for(int j = word.length()-1; j >= 0; j--){
                revWord += word.charAt(j);
            }
            revStr += revWord;

            //Check to add spaces as we don't need space after last word
            if(i != words.length-1)
                revStr += " ";
            else
                break;
        }
        System.out.println(revStr);

    }
}

