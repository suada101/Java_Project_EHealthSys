// real java projekt

package deleteChangeFunction;

public class appointments {
	String name;
	String description;
	String date;
        int appcnt=0;
	
	public appointments() {
		this.name= null;
		this.description=null;
		this.date=null;
	}
	
	public appointments(String x ,String y ,String z) {
		this.name= x;
		this.description=y;
		this.date=z;
	}
        
        

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
