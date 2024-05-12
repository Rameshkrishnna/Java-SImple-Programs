package javasimpleprograms;
public class reverse {
    public static void main(String[] args) {
        String text="malayalam";
        String reverse="";
        for (int i = text.length(); i > 0; i--) {
            reverse=reverse+text.substring(i-1, i);
        }
        System.out.println(reverse);
        System.out.println(text);
        System.out.println(text.toLowerCase().equals(reverse.toLowerCase()));
    }
}
