package alternativaDois;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		globalConfig config = globalConfig.getInstance();
		
		System.out.println("Device Name: " + config.getDeviceName());
		System.out.println("ApiEndPoint: " + config.getApiEndpoint());
		System.out.println("Devices: " + config.getMaxDevices());
		
		config.setDeviceName("IoTDevice");
		config.setApiEndpoint("http://newapi.endpoint.com");
		config.setMaxDevices(25);
		
		globalConfig anotherConfig = globalConfig.getInstance();
		System.out.println("Device Name (another Device): " + anotherConfig.getDeviceName());
		System.out.println("Api Endpoint (another Device): " + anotherConfig.getApiEndpoint());
		System.out.println("Devices (another Device): " + anotherConfig.getMaxDevices());
	}

}
