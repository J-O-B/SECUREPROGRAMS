package models;

public class CommandResult {
	private String host, result;
	
	public CommandResult(String host, String result) {
		super();
		this.host = host;
		this.result = result;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}