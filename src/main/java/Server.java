import Redis.Function;
import Redis.string.StringRedisService;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        Function function = new Function();

        try (ServerSocket server = new ServerSocket(8000)){
            System.out.println("Server started!");

            try(
                    Socket socket = server.accept();
                    BufferedWriter writer =
                         new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    BufferedReader reader =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()))


            ){


                while (true) {
                    String request = reader.readLine();
                    writer.write(function.select(request));
                    writer.newLine();
                    writer.flush();
                }

            }
        }catch (IOException e){
            throw new RuntimeException();
        }


    }
}
