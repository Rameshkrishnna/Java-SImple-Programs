package javasimpleprograms;
public class prime {
    public static void main(String[] args) {
        int num=12;
        if(num==1 || num==0){
            System.out.println(false);
        }else if(num==2){
            System.out.println(true);
        }else{
            if(num%2==0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
