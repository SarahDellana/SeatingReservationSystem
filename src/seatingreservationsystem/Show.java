/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatingreservationsystem;

/**
 *
 * @author Sarah
 */
public class Show {
    
    private String showName; 
    private int showDate;
    
public Show (String showName, int showDate) {
    
    this.showName = showName;
    this.showDate = showDate;
    
}

public String getshowName () {
    return showName; 
    
}

public int getshowDate () { 
    return showDate;
}
    
}
