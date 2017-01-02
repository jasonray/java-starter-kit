package jayray.net;

public class Main {
    public static void main(String[] args) {
        SillyText sillyText = new SillyText();
        String text = "Hello World!";
        String silly = sillyText.sillyfy(text);
        System.out.println(text + " => " + silly);
    }
}
