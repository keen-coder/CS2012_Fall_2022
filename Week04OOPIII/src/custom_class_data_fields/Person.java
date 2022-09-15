package custom_class_data_fields;

public class Person {
	private String name;
	private Birthday bday;

	public Person(String name, Birthday bday) {
		this.name = name;
		this.bday = bday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
	}
	
	
	
	
	
}
