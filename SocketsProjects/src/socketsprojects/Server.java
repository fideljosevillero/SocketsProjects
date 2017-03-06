/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsprojects;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectOutputStream;
/**
 *
 * @author fidel.villero
 */
public class Server {
    
    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectOutputStream objOutputString;
    
    public Server() throws IOException{
        try{
            serverSocket = new ServerSocket(7777); // 7777 es el port donde se va a conectar con el cliente.
            // Hace la coneccion con el cliente, 
            // hastra que el cliente no se conecte no va a avanzar de esta linea
            socket = serverSocket.accept();
            objOutputString = new ObjectOutputStream(socket.getOutputStream());
            // escribir un mensaje por medio de este canal
            objOutputString.writeObject("Fidel José Villero de Hoyos!!!");
            
        }catch(Exception er){
            System.out.println("Error en el server " + er.toString());
        }finally{
            // cerra los flujos
            objOutputString.close();
            serverSocket.close();
            socket.close();
        }
    }
    
}
