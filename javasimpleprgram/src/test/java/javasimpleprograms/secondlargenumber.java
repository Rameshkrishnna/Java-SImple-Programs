package javasimpleprograms;
public class secondlargenumber {
    public static void main(String[] args) {
        int[] nums={1,55,3,9,55,8};
        int lnum=nums[0];
        for (int i : nums) {
            if (i>lnum) {
                lnum=i;
            }
        }
        //System.out.println(lnum);
        int secnum=nums[0];
        for (int i : nums) {
            if (i<lnum && secnum<i) {
                secnum=i;
            }
        }
        System.out.println(secnum);
    }
}
