package deleteChangeFunction;

public class CountofAppointments {
	public static int appcnt = 0;
	protected int modifiedappcnt;    


    public int getappcnt(){
            return appcnt;
    }
    
    public void setappcnt(){
        appcnt++;
    }
    
    public void decrementappcnt(){
    	appcnt--;
    }
    

public static CountofAppointments cntofapp = new CountofAppointments();



    
}

