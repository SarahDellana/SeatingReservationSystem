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
public class Ticket {
    
    private String ticketName; 
    private String ticketDate;
    private String ticketTime; 
    
public Ticket (String ticketName, String ticketDate, String ticketTime) {
    
    this.ticketName = ticketName;
    this.ticketDate = ticketDate;
    this.ticketTime = ticketTime; 
}

public String getticketName () {
    return ticketName; 
    
}

public String getticketDate () { 
    return ticketDate;
}

public String getticketTime () { 
    return ticketTime; 
}

public void setticketName(String ticketName) {
        this.ticketName = ticketName;
    }
    
public void setshowDate(String ticketDate) {
        this.ticketDate = ticketDate; 
    }

public void setticketTime (String ticketTime) {
       this.ticketTime = ticketTime; 
}


}
