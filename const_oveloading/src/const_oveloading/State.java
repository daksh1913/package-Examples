package const_oveloading;

public class State {
	
	private String state;
	
	public State()
	{
		super();
		this.state = "Gujarat";
	}
	
	

	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "State [state=" + state + "]";
	}
	
	

}
