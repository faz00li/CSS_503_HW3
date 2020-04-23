/**
 * Created by rtdimpsey on 4/13/17.
 */
import java.net.*;
import java.io.*;

public class NewThreadDateServer
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket sock = new ServerSocket(6013);
            while (true)
            {
                Socket client = sock.accept();
                Worker worker = Worker(client);
                
                // PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
                // pout.println(new java.util.Date().toString());
                // client.close();
            }
        }
        catch (IOException ie) {}
    }
}
