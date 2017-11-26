/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatingreservationsystem;

import java.awt.Button;
import java.awt.Insets;
import static java.awt.SystemColor.window;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JComboBox;

/**
 *
 * @author Sarah
 */
public class SeatingReservationSystem extends Application {
    
    ArrayList<Ticket> ticket = new ArrayList<>(); 
    ArrayList<Seat> seat = new ArrayList<>(); 
    ArrayList<Group> group = new ArrayList<>(); 
    //JComboBox<Ticket> ticketList = new JComboBox<>();
    
    ComboBox<String> comboBox; 
    
    Stage window; 
    Scene scene;
    Button button; 

    
    @Override
    public void start(Stage primaryStage) {
        
    comboBox = new ComboBox<>();    
    comboBox.getItems().addAll (
            "The Jungle Book", 
            "Madame Buetterfly"
            );
        //ticketList.addItem(new Ticket("The Jungle Book"));
        //ticketList.addItem(new Ticket("Madame Butterfly"));
        
    comboBox.setPromptText("Show"); 


    ticket.add(new Ticket("The Jungle Book","12/03/2017","16:00")); 
    ticket.add(new Ticket("Madame Butterfly","04/12/2017","20:00")); 
    ticket.add(new Ticket("The Lion King","07/10/2017","16:00")); 
    
    seat.add(new Seat(1,2,3,4,5)); //create int range 
    
    Group a = new Group(); 
    a.setgroupName("VIP");
    
    Group b = new Group();
    b.setgroupName("Sponsor");
    
    Group c = new Group();
    c.setgroupName("Press");
    
    Group d = new Group();
    d.setcontactName("John Peter");
    
    Group e = new Group();
    e.setcontactName("Bjorn Jensen");
    
    Group f = new Group(); 
    f.setcontactName("George Clooney");
    
    Group g = new Group();
    g.setcolor("Yellow");
    
    Group h = new Group();
    h.setcolor("Purple");
    
    Group i = new Group();
    i.setcolor("Blue"); 
    
    {
       window = primaryStage;
       window.setTitle("Your mom");
       button = new Button("Submit");
       
      VBox root = new VBox(); //Creates a new pop up window 
        //root.getChildren().add(button); //Adds the Job button to the pop up window  
        
        Scene scene = new Scene(root, 500, 250); //Sets the pop up window's dimensions 
        
        primaryStage.setTitle("Booking"); //The text at the top of the pop up window 
        primaryStage.setScene(scene);
        primaryStage.show();
         
    }

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
    //    launch(args);   
    }
    
    
    
}
