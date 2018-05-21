package games;
import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class ugadaika {
    public static void main (String args []) {
        Scanner keyboard_ = new Scanner(System.in);//System.in = клавиатура
        out.print("Введите число от 0 до 10: ");
        int inputNumber_ = keyboard_.nextInt();//???
        int randomNumber = new Random().nextInt(10) + 1;
        if (inputNumber_ == randomNumber) {
            out.println("**********");
            out.println("Вы выиграли!");
            out.println("***********");
        } else {
            out.println("***");
            out.println("Вы проиграли ");
            out.println("***"  );
            out.println("Случайное число равно: ");
            out.println(randomNumber );
        }

        }

    }

