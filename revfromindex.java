public class revfromindex {
    public static void main(String[] args) throws Exception {
        String s = "pavan";
        String left =s.substring(0, 2);
        int k =2;
        String right = "";
        for (int i =s.length()-1; i>=k;i--){
            right += s.charAt(i);

        }System.out.println(right);
    
    String rev = left + right;
    System.out.println(rev);
    }
}