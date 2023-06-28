public class frequency{
    public static void main(String[] args) {
        String s ="pavan";
        char[] ch =s.toCharArray();
        int n=ch.length;
        int freq[]= new int[s.length()];
        // int visited= -1;
        // int count=0;
        for(int i =0;i<n;i++){
            freq[i]=1;
            for(int j =i+1;j<n;j++){
                if (ch[i]==ch[j]) {
                    freq[i]++;
                     ch[j]='0';
                    
                }
            }

        }
        for(int i =0;i<freq.length;i++){
            if(ch[i]!= ' ' && ch[i]!='0'){
                System.out.println(ch[i] + " " + freq[i]);
            }

        }

    }
}