
import java.sql.Connection;
public class SampleSingleton {

    private static Connection conn = null;

    private static SampleSingleton instance = null;

    public static SampleSingleton getInstance() {
        return instance;
    }

}
