package features;

public class ShorterText {
    public static String shorter(String text) {
        String newText = "";
        for (int i = 0; i < 19; i++)
            newText += text.charAt(i);
        newText += "...";
        return newText;
    }
}
