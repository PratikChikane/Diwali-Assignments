public class LongestString {
    public static int longString(String[] arr){
        int max =0;
        for(String s :arr){
            if(s.length() > max){
                max=s.length();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] flowers = {"Rose","Lotus","sunflower","daisy","Lily"};
        
        System.out.println("Length of the longest String is:" + longString(flowers));
    }
}
