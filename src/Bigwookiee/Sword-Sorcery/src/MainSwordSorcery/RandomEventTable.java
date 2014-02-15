/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainSwordSorcery;

import java.util.Random;

/**
 *
 * @author David
 */
public class RandomEventTable {
    private int eventKey;
    private int eventLength;
    private String eventDescription;
    private int die1; 
    private int die2;
    private int currentEvent; 
    Random generator = new Random();
    
        
    private void KeyLookup(int d1, int d2){
        if ((d1 >= 0 && d1 <= 5) && (d2 >= 0 && d2 <= 5))
        switch (d1) {
            case 0 : 
                if (d2 == 0) {eventKey = 1; break;}
                if (d2 == 2) {eventKey = 7; break;}
                if (d2 == 4) {eventKey = 8; break;}
                if (d2 == 5) {eventKey = 9; break;} 
                eventKey =0;
                break;
                
            case 1 :
                if (d2 == 1) {eventKey = 2; break;}
                if (d2 == 3) {eventKey = 10; break;}
                if (d2 == 5) {eventKey = 11; break;} 
                eventKey =0;
                break;
                
            case 2 :
                if (d2 == 0) {eventKey = 12; break;}
                if (d2 == 2) {eventKey = 3; break;}
                if (d2 == 4) {eventKey = 13; break;}
                if (d2 == 5) {eventKey = 14; break;} 
                eventKey =0;
                break;
                
            case 3 :
                if (d2 == 1) {eventKey = 15; break;}
                if (d2 == 3) {eventKey = 4; break;}
                if (d2 == 5) {eventKey = 16; break;} 
                eventKey =0;
                break;
                
            case 4 :
                if (d2 == 0) {eventKey = 17; break;}
                if (d2 == 2) {eventKey = 18; break;} 
                if (d2 == 4) {eventKey = 5; break;}
                if (d2 == 5) {eventKey = 19; break;} 
                eventKey =0;
                break;
                
            case 5 :
                if (d2 == 1) {if (currentEvent == 13) eventKey = 0; else eventKey = 20; break;}
                if (d2 == 3) {eventKey = 21; break;}
                if (d2 == 5) {eventKey = 6; break;}
                eventKey =0;
                break;
                
            }//Case
        
        else {
                if (d1 >= 6 || d1 < 0){ 
                    System.out.println("Die1 has an invaled value of " + d1);
                    
                    if (d2 >= 6 || d2 < 0)
                        System.out.println("Die2 has an invaled value of " + d2);
                }
                else 
                    if (d2 >= 6 || d2 < 0)
                        System.out.println("Die2 has an invaled value of " + d2);
        }          
                      
    }//KeyLookUp

    private void LookupDescription(int eKey){
        if (eKey >=0 || eKey <=21)
        switch (eKey) {
            
            case 0:
                eventDescription = "No random event occurs.";
                break;
                
            case 1:
                eventDescription = "Yellow sun manna flux.";
                break;
                
            case 2:
                eventDescription = "Yellow sun manna drought.";
                break;
                
            case 3:
                eventDescription = "Blue sun manna flux.";
                break;
                
            case 4:
                eventDescription = "Blue son manna drought";
                break;
                
            case 5:
                eventDescription = "Red sun manna flux";
                break;
            
            case 6:
                eventDescription = "Red sun manna drought.";
                break;
                
            case 7:
                eventDescription = "Elven high holy day.";
                break;
               
            case 8:
                eventDescription = "Season of the midnight sun.";
                break;
                
            case 9:
                eventDescription = "Church declares a special communion as a tribute to the Emperor.";
                break;
                
            case 10:
                eventDescription = "Dwarrows hold a folk moot.";
                break;
                
            case 11:
                eventDescription = "Conjunction of fear.";
                break;
            
            case 12:
                eventDescription = "Corfluite collation.";
                break;
                
            case 13:
                eventDescription = "Drought.";
                break;
                
            case 14:
                eventDescription = "Flooding.";
                break;
                
            case 15:
                eventDescription = "Earthquake.";
                break;
                
            case 16:
                eventDescription = "Windstorm.";
                break;
                
            case 17:               
                eventDescription = "Mount GreyMoore and mount Gerlod erupt.";
                break;
                
            case 18:
                eventDescription = "The Mistral is blowing.";
                break;
                
            case 19:
                eventDescription = "Vortex storm.";
                break;
                
            case 20:
                    eventDescription = "Killer penguin migration";
                break;
                
            case 21:               
                eventDescription = "Poisonous piranha infestation.";
                break;
                
            default:
                break;
        }//case 
        else 
            System.out.println("EventKey has an invaled value of " + eKey);
    }//DescriptionLookUp
    
    private void LookUpLength(int eKey){
        if (eKey >=0 || eKey <=21)
            if (eKey == 13)  eventLength = 3;
            else eventLength = 1;
        else 
            System.out.println("EventKey has an invaled value of " + eKey);
    }//LookUpLength
    
            
    public int EventKey() {
        
        return eventKey;
        
    }//EventKey
    
    public int EventLength() {
        
        return eventLength;
        
    }//EventLength
    
    public String EventDescription(){
        
        return eventDescription;
        
    }//EventDescription
    
    public RandomEventTable() {
        
        die1 = generator.nextInt(6);
        die2 = generator.nextInt(6);
        
        //System.out.println("Die1: " + (die1 + 1));
        //System.out.println("Die2: " + (die2 + 1));
        
        currentEvent = 0;
        
        this.KeyLookup(die1, die2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);
        
    }//RandomEventTable()
       
    public RandomEventTable(int inEvent) {
     
        die1 = generator.nextInt(6);
        die2 = generator.nextInt(6);
        
        //System.out.println("Die1: " + (die1 + 1));
        //System.out.println("Die2: " + (die2 + 1));
        
        currentEvent = inEvent;
        
        this.KeyLookup(die1, die2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);
        
    }//RandomEventTable(int inEvent)
        
    public RandomEventTable(int inEvent, int die1, int die2){
        
        currentEvent = inEvent;
        
        this.KeyLookup(die1, die2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);
    }//RandomTable(int inEvent, int die1, int die2)
    
    public void NewRandomEvent(){
     
        die1 = generator.nextInt(6);
        die2 = generator.nextInt(6);
        
        //System.out.println("Die1: " + (die1 + 1));
        //System.out.println("Die2: " + (die2 + 1));
        
        currentEvent = 0;
        
        this.KeyLookup(die1, die2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);        
        
    }//NewRandomEvent()
    
    public void NewRandomEvent(int inEvent){
     
        die1 = generator.nextInt(6);
        die2 = generator.nextInt(6);
        
        //System.out.println("Die1: " + (die1 + 1));
        //System.out.println("Die2: " + (die2 + 1));
        
        currentEvent = inEvent;
        
        this.KeyLookup(die1, die2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);        
        
    }//NewRandomEvent(int inEvent){
    
    public void NewRandomEvent(int inEvent, int d1, int d2){
        
        currentEvent = inEvent;
        
        //System.out.println("NewRandomEvent(int,int,int)");
        //System.out.println("Die1: " + (d1 + 1));
        //System.out.println("Die2: " + (d2 + 1));
        
        this.KeyLookup(d1, d2);
        this.LookupDescription(eventKey);
        this.LookUpLength(eventKey);
    }//NewRandomEvent(int inEvent, int Die1, int die2){
            
    
}//class
