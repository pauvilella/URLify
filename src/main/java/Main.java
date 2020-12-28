import java.util.*;

public class Main {
    String inputString = "Mr John Smith    ";
    int inputLength = 13;

    String urlify(String sentence, int length) {
        char[] arraySentence = sentence.toCharArray();
        char[] result = new char[sentence.length()];
        int offset = 0;
        for (int i = 0; i < length; i++) {
            if(arraySentence[i] == ' ') {
                result[i+offset] = '%';
                offset++;
                result[i+offset] = '2';
                offset++;
                result[i+offset] = '0';
            } else {
                result[i+offset] = arraySentence[i];
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Main program = new Main();
        String result = program.urlify(program.inputString, program.inputLength);
        System.out.println(result);
    }
}
