package javasimpleprograms;
public class spaceremove {
    public static void main(String[] args) {
        String text="kshfv euh ww wevuh wev";
        String output="";
        for (int i = 0; i < text.length(); i++) {
            char schar = text.charAt(i);
            if(!Character.isWhitespace(schar)){
                output=output+schar;
            }
            
        }
        System.out.println(output);
    }
}
