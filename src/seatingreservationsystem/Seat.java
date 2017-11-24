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
public class Seat {
    
    private int seatNumber;

public Seat (int seatNumber) {
    
    this.seatNumber = seatNumber;
}

public int getseatNumber () {
    return seatNumber;    
}

public void setseatNumber (int seatNumber) {
    this.seatNumber = seatNumber; 
}
}
