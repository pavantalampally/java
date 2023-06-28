import java.util.HashSet;

public class longestsubarray {
    public static void main(String[] args) {
        String s= "bbbb";
        int n =s.length();
        int start =0;
        int end =0;
        HashSet <Character> uniqueChars = new HashSet<>();
        String longSubString="";
         while(end < n){
            char currentChar = s.charAt(end);
            if(!uniqueChars.contains(currentChar)){
                uniqueChars.add(currentChar);
                end++;
                if(end - start > longSubString.length()){
                    longSubString =s.substring(start, end);
                }
            }else{
                uniqueChars.remove(s.charAt(start));
                start++;
            }
         }System.out.println(longSubString);
    }
}
