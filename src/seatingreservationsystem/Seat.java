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

    Seat(int i, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getseatNumber () {
    return seatNumber;    
}

public void setseatNumber (int seatNumber) {
    this.seatNumber = seatNumber; 
}
}
