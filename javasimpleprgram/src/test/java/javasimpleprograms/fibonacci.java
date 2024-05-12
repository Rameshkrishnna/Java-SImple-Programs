package javasimpleprograms;
public class fibonacci {
    public static void main(String[] args) {
        int fnum=0;
        int snum=1;
        int temp=0;
        // System.out.println(fnum);
        // System.out.println(snum);
        for (int i = 0; i < 10; i++) {
            System.out.println(snum);
            temp=fnum;
            fnum=snum;
            snum=temp+snum;
        }
    }
}
