package shashwat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.LinkedHashSet;
public class day1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<>();
        cmap.put(1, "Hello");
        cmap.put(2, "World");
        System.out.println(cmap);
        System.out.println("This is An Example of ConcurrentHashMap");
    }

}
