package javasimpleprograms;

import java.util.ArrayList;

public class mergelist {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("a");
        a.add("z");
        ArrayList<String> b=new ArrayList<>();
        b.add("b");
        b.add("z");
        ArrayList<String> c=new ArrayList<String>(a);
        c.addAll(b);
        System.out.println(c);
    }    
}
