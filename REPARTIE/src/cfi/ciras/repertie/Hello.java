package cfi.ciras.repertie;

import java.rmi.Remote; 
import java.rmi.RemoteException; 


public interface Hello extends Remote{

	void printMsg() throws RemoteException; 
}
