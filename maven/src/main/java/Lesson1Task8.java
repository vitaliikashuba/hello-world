import java.util.ArrayList;

public class Lesson1Task8 {
    public static void main(String[] args) {
    int[] a = {72,101,108,108,111,32,119,111,114,108,100}; //create array
    printList(transformIntToChar(a)); //set methods
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}
