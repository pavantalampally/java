public class replacewords {
    public static void main(String[] args) {
        String s= "india beats pakistan in pakistan";
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("india")){
                words[i] = "pakistan";
            }else if(words[i].equals("pakistan")){
                words[i]= "india";
            }
        }String str = String.join(" " ,  words);
        System.out.println(str);
    }
}
