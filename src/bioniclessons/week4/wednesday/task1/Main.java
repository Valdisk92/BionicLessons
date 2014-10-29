package bioniclessons.week4.wednesday.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Владислав on 29.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String string;
            while ((string = reader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Нет  файла");
        } catch (IOException e) {
            System.out.println("Неизвестная ошибка");
        }
    }
}
