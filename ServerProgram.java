import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
    public static void main(String[] args) {
        try {
            // Server runs on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is running... Waiting for client");

            Socket socket = serverSocket.accept(); // Waits for client
            System.out.println("Client Connected!");

            // Send data to client
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println("Welcome from Server!");

            // Close all connections
            output.close();
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println("Server Error: " + e);
        }
    }
}
