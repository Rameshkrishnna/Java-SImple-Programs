package javasimpleprograms;
public class vowel {
    public static void main(String[] args) {
        String text="Rimsh";
        boolean s=text.toLowerCase().matches(".*[aeiou].*");
        System.out.println(s);
    }
}
