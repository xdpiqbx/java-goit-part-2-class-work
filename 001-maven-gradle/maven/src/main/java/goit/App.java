package goit;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Map<String, String> human = Collections.singletonMap("name", "John Doe");
        System.out.println("new Gson().toJson(human) = " + new Gson().toJson(human));
    }
}
