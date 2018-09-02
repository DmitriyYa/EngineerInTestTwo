import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        String repeat="да";

        while (repeat.equals("да")){
            System.out.println("Введите входные данные.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String in = reader.readLine();
            cat.action(in);

            System.out.println("Если хотите продолжить, введите - да");
            String inRepeat = reader.readLine().toLowerCase();
            if (!inRepeat.equals("да")){
                repeat=" ";
                reader.close();
            }
        }

    }
}
