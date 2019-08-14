package wtp;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

public class ConverterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
            float celsiusValue = 100;
            ConverterStub stub = new ConverterStub();
            ConverterStub.CelsiusToFarenheit cc2f = new ConverterStub.CelsiusToFarenheit();
            cc2f.setCelsius(celsiusValue);
            ConverterStub.CelsiusToFarenheitResponse cc2f_res = stub.celsiusToFarenheit(cc2f);
            
            System.out.println("Celsius : "+celsiusValue+" = "+"Farenheit : " + cc2f_res.get_return());
    } catch (AxisFault e) {
            e.printStackTrace();
    } catch (RemoteException e) {
            e.printStackTrace();
    }		

	}

}

