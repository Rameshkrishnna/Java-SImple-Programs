package javasimpleprograms;
import java.lang.reflect.Array;

public class duplicatearray {
    public static void main(String[] args) {
        int[] a={1,2,5,5,8};
        int[] b={1,2,3,4,8};
        boolean c=true;
        for (int i : a) {
            if(Array.getLength(a)==Array.getLength(b)){
                
            }else{
                c=false;
            }
            
        }
        System.out.println(c);
    }
}
