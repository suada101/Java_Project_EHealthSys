/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suada
 */
public class AppointmentCount {
    int appcnt = 0; 
    int modifiedappcnt= appcnt;


    public int getappcnt(){
            return appcnt;
    }
    
    public void setappcnt(){
        appcnt++;
    }
    

public static AppointmentCount appointmentcnt = new AppointmentCount();    
    
}

