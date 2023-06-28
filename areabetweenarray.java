// import java.util.HashSet;

public class areabetweenarray {
    public static void main(String[] args) {
        int left =0;
        int [] height = {1,8,6,2,5,4,8,3,7};
        int right = height.length-1;
        int area=0;//initial
        while(left<right){
            int currentarea = Math.min(height[left], height[right]) * (right-left);
            area = Math.max(area, currentarea);
            if(height[left]< height[right]){
                left++;
            }else{
                right--;
            }
        }

        System.out.println(area);
    }
    
}
