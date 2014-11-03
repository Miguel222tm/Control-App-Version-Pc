/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

public class WaitThread implements Runnable{
MainHome main= new MainHome();
	/** Constructor */
        int conex=0;
        

	public WaitThread() {
	}
	
	@Override
	public void run() {
		waitForConnection();		
	}
	
	/** Waiting for connection from devices */
	private void waitForConnection() {
		// retrieve the local Bluetooth device object
		LocalDevice local = null;
		
		StreamConnectionNotifier notifier;
		StreamConnection connection = null;
		
		// setup the server to listen for connection
		try {
			local = LocalDevice.getLocalDevice();
			local.setDiscoverable(DiscoveryAgent.GIAC);
                System.out.println( LocalDevice.getLocalDevice().getFriendlyName());
			
			UUID uuid = new UUID("04c6093b00001000800000805f9b34fb", false);
			System.out.println(uuid.toString());
			
                        String url = "btspp://localhost:" + uuid.toString() + ";name=RemoteBluetooth";
                         notifier = (StreamConnectionNotifier)Connector.open(url);
        }        catch (BluetoothStateException e) {
                            System.out.println("Bluetooth is not turned on.");
                            	e.printStackTrace();
                                    return;
		} catch (IOException e) {
			e.printStackTrace();
                            return;
		}
		
		// waiting for connection
                        while(true) {
                                try {
                                     Thread.sleep(100);
                                     
                                	System.out.println("waiting for connection...");
                                        conex=1;
                                        Status(conex);
                                       
                                        main.setBluetooth("Bluetooth Device: \n"+LocalDevice.getLocalDevice().getFriendlyName());
                                         
       
                                              connection = notifier.acceptAndOpen();
	            
                                                Thread processThread = new Thread(new ProcessConnectionThread(connection));
                                                     processThread.start();
                                                     
	            
			} catch (Exception e) {
                                    e.printStackTrace();
				return;
			}
		}
	}
        
        public int Status(int con){
            return con;
            
        }
        
        
}