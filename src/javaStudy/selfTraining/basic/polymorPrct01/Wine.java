package polymorPrct01;

public class Wine {
	private String name;

	public Wine() {
		setName("Wine");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String drink() {
		return "ºÈµÄÊÇ " + getName();
	}

	/**
	 * ÖØÐ´toString()
	 */
	public String toString() {
		return null;
	}
}
