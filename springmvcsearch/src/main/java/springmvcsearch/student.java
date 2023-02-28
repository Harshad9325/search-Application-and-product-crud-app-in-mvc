package springmvcsearch;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class student {public student() {
}
	private String name;
	private long id;

	private Date DOB;
	public List<String> courses;
	public String gender;
	public String type;

	public Address address;
	
}