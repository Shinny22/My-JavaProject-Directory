package cfi.ciras.repertie;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class ImplExample extends UnicastRemoteObject implements Hello {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ImplExample() throws RemoteException {}


    
    public void printMsg() throws RemoteException {
        System.out.println("This is an example RMI program");
    }
} 
