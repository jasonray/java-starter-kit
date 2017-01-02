/**
 * Created by jason.ray on 1/2/17.
 */
public class SillyText {
    public String sillyfy(String input) {
        if (input == null) return input;
        input = input.replace("s", "$");
        input = input.replace("o", "0");
        input = input.replace("l", "!");
        return input;
    }
}
