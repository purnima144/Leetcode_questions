package Arrays_and_strings;
import java.util.*;
public class longestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args){
       int res = lengthOfLongestSubstring("babcdbb");
       System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> List = new LinkedList<>();
        int max = 0;
        for(char ch : s.toCharArray()){
            //check if the list already contains the ch, if yes then pop the char until the same ch in list and pop that ch too
            if(List.contains(ch)){
                while(List.peek() != ch){
                    List.poll();
                }
                List.poll();
            }
            List.add(ch);
            max = Math.max(max,List.size());
        }
        return max;
    }


}
