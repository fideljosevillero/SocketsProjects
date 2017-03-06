/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsprojects;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author fidel.villero
 */
public class Client {
    
    private Socket socketCliente;
    private ObjectInputStream objOutputString;
    
    public Client() throws IOException{
        try{
            // 7777 es el port donde se va a conectar con el cliente.
            socketCliente = new Socket("localhost", 7777);
            objOutputString = new ObjectInputStream(socketCliente.getInputStream());
            System.out.println((String)objOutputString.readObject());
            
        }catch(IOException | ClassNotFoundException ere){
            System.out.println("Error en el socet cliente "+ere.toString());
        }finally{
            objOutputString.close();
            socketCliente.close();
        }
    }

    private Exception Exception() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
