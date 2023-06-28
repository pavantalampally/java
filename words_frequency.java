public class words_frequency {
    public static void main(String[] args) {
        String s = "pavan is my name is pavan";
        
        s= s.toLowerCase();
        System.out.println(s);
        int count=0;
        String words[] = s.split(" ");
        int n = words.length;
        for(int i =0;i<n;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if (count>1 && words[i]!="0")
            System.out.println(words[i]);
            
        }    
    }
}
