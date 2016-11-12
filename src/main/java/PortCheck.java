import java.io.IOException;
import java.net.Socket;

/**
 * Created by sam on 11/11/2016.
 */
public class PortCheck {

    public static boolean isAvailable(int port) {

        System.out.println("Testing port " + port);

        Socket s = null;

        try {
            s = new Socket("localhost", port);

            System.out.println("Port " + port + " is not available");
            return false;

        } catch (IOException e) {

            System.out.println("Port " + port + " is available");
            return true;

        } finally {

            if( s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    throw new RuntimeException("¯\\_(ツ)_/¯" , e);
                }
            }
        }
    }
}
