package javasimpleprograms;
public class App {
    public static void main(String[] args) throws Exception {
        int nums[]={11,55,88,22,1,58};
        int snum=nums[0];
        for(int i=0;i<5;i++){
            int j=i+1;
            if(snum>nums[j]){
                snum=nums[j];
            }
        }
        System.out.println(snum);
    }
}
