/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println("Class Work!");
        Student usenko = new Student("Artem", "Usenko");
        System.out.println(new Gson().toJson(usenko));

        Scanner scanner = new Scanner(new File("./app/data.txt"));
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
