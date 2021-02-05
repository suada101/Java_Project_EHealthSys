/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otherclasses;

/**
 *
 * @author suada
 */
public class Doctor
{
    public String name;
    public int KM; 
    public String adressofdoctor;
    
    
    public Doctor(String n, int k, String addofdoc){
        name = n;
        KM = k;
        adressofdoctor = addofdoc;
     
    }

    
public static Doctor general1 = new Doctor ("Dr. Meredith Grey",2,"Riedbergerstr. 10");
public static Doctor general2 = new Doctor("Dr. Mark Sloan",10,"Ginnheimerstr. 10");
public static Doctor general3 = new Doctor("Dr. Addison Montgomery",5,"Niederurselerstr. 10");
public static Doctor general4 = new Doctor("Dr. Alex Karev",15,"Eckeneheinmerstr. 10");

public static Doctor heart1 = new Doctor("Dr. Christina Young",2,"Hedderheimerstr. 10");
public static Doctor heart2 = new Doctor("Dr. Izzie Stevens",10,"Bockenheimerstr. 10");

public static Doctor lungs1 = new Doctor("Dr. April Kepner",5,"Harheimersr. 10");
public static Doctor lung2 = new Doctor("Dr. Jackson Avery",10,"Praunheimerstr. 10");

public static Doctor stomach1 = new Doctor("Dr. Miranda Bailey",2,"Niederurselerstr 10");
public static Doctor stomach2 = new Doctor("Dr. Derek Shepherd",10,"Niederurselerstr 10");

}



