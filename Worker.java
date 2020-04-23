import java.net.*;
import java.io.*;



public class Worker extends Thread
{
  private long myID;
  private Socket client;
  
  Worker(Socket nClient)
  { 
    myID = getId();
    client = nClient;
  }

  public void run()
  {
    try
    {
      System.out.println("Worker " + myID + " printing date... ");
      PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
      pout.println(new java.util.Date().toString());
      client.close();
    }
    catch (InterruptedException ie)
    {

    }
  }
    
}