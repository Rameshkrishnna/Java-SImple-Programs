package javasimpleprograms;

public class intcheck {
    public static void main(String[] args) {
        int[] nums={3,5,9};
        boolean odd=true;
        for (int i : nums) {
            if(i%2==0){
                odd=false;
            }
        }
        System.out.println(odd);
    }
}
