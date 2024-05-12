package javasimpleprograms;
public class arraysum {
    public static void main(String[] args) {
        int[] nums={1,2,5,4,8,5};
        int sum=0;
        for (int i : nums) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
