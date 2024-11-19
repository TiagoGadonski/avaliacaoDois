package alternativaDois;

public class globalConfig {
	private static volatile globalConfig instance;
	
	private String deviceName;
	private String apiEndpoint;
	private int maxDevices;
	
	private globalConfig() {
		this.deviceName = "Default";
		this.apiEndpoint = "http://api.com";
		this.maxDevices = 100;
	}
	
	public static globalConfig getInstance() {
		if(instance == null) {
			instance = new globalConfig();
		}
		
		return instance;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getApiEndpoint() {
		return apiEndpoint;
	}

	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
	}

	public int getMaxDevices() {
		return maxDevices;
	}

	public void setMaxDevices(int maxDevices) {
		this.maxDevices = maxDevices;
	}
	
	
}
