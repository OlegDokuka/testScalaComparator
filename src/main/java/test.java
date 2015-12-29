/**
 * Created by olehd on 29.12.2015.
 */

import comparator.Comparator;
import scala.collection.immutable.Map;

import java.util.regex.Pattern;

public class test {
    public static void main(String... args) {
        Comparator.lenient(new Map<String, Pattern>()).compare("", "");
    }
}
