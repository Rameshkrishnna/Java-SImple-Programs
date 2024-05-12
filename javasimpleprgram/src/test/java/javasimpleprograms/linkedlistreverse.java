package javasimpleprograms;
import java.util.LinkedList;
import java.util.List;

public class linkedlistreverse {
    public static void main(String[] args) {
        List<Integer>nums=new LinkedList<>();
        nums.add(50);
        nums.add(6);
        nums.add(22);
        List<Integer>rev=new LinkedList<>();
        
        for (int i = (nums.size()-1); i >= 0; i--) {
            rev.add(nums.get(i));
        }
        System.out.println(rev);
    }
}
