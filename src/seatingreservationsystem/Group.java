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
public class Group { 
    private String groupName;
    private String contactName; 
    private String color; 
    
//groupname, contact name, color(should be seperate class?) 
    
public Group (String groupName, String contactName, String color) {
    
    this.groupName = groupName; 
    this.contactName = contactName; 
    this.color = color; 

}

    Group(String vip) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Group() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void setgroupName(String groupName){
    this.groupName = groupName; 

 } 

public void setcontactName(String contactName){ 
    this.contactName = contactName; 
}
public void setcolor(String color) {
    this.color = color; 
}


public String getcontactName() { 
    return contactName; 
}
public String getgroupName() {
       return groupName; 
       
}

public String color() {
    return color; 
}


}
