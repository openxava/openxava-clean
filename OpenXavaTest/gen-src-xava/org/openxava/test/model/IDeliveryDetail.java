

// File generated by OpenXava: Fri Jul 09 10:55:15 CEST 2021
// Archivo generado por OpenXava: Fri Jul 09 10:55:15 CEST 2021

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Delivery		Java interface for aggregate/Interfaz java para Agregado: DeliveryDetail

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IDeliveryDetail  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_number = "number"; 	
	int getNumber() throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException;		

	// References/Referencias 

	// Delivery : Reference/Referencia
	
	org.openxava.test.model.IDelivery getDelivery() throws RemoteException;
	void setDelivery(org.openxava.test.model.IDelivery newDelivery) throws RemoteException;

	// Methods 


}