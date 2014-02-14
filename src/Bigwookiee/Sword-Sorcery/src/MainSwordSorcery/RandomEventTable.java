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
       
    public RandomEventTable(int inEvent) {
        int die1;
        int die2;
        
        Random generator = new Random();
        
        die1 = generator.nextInt(6);
        die2 = generator.nextInt(6);
         
        //Testing code
        //System.out.println("Called Random Table");
        //System.out.println(die1);
        //System.out.println(die2);
        
        switch (die1) {
            case 0 : 
                if (die2 == 0) {eventKey = 1; break;}
                if (die2 == 2) {eventKey = 7; break;}
                if (die2 == 4) {eventKey = 8; break;}
                if (die2 == 5) {eventKey = 9; break;} 
                eventKey =0;
                break;
                
            case 1 :
                if (die2 == 1) {eventKey = 2; break;}
                if (die2 == 3) {eventKey = 10; break;}
                if (die2 == 5) {eventKey = 11; break;} 
                eventKey =0;
                break;
                
            case 2 :
                if (die2 == 0) {eventKey = 12; break;}
                if (die2 == 2) {eventKey = 3; break;}
                if (die2 == 4) {eventKey = 13; break;}
                if (die2 == 5) {eventKey = 14; break;} 
                eventKey =0;
                break;
                
            case 3 :
                if (die2 == 1) {eventKey = 15; break;}
                if (die2 == 3) {eventKey = 4; break;}
                if (die2 == 5) {eventKey = 16; break;} 
                eventKey =0;
                break;
                
            case 4 :
                if (die2 == 0) {eventKey = 17; break;}
                if (die2 == 2) {eventKey = 18; break;} 
                if (die2 == 4) {eventKey = 5; break;}
                if (die2 == 5) {eventKey = 19; break;} 
                eventKey =0;
                break;
                
            case 5 :
                if (die2 == 1) {eventKey = 20; break;}
                if (die2 == 3) {eventKey = 21; break;}
                if (die2 == 5) {eventKey = 6; break;} 
                
            default : 
                eventKey = 0;
                break;
        }// case

        switch (eventKey) {
            
            case 0:
                eventLength = 1;
                eventDescription = "No random event occurs.";
                break;
                
            case 1:
                eventLength = 1;
                eventDescription = "Yellow sun manna flux.";
                break;
                
            case 2:
                eventLength = 1;
                eventDescription = "Yellow sun manna drought.";
                break;
                
            case 3:
                eventLength = 1;
                eventDescription = "Blue sun manna flux.";
                break;
                
            case 4:
                eventLength = 1;
                eventDescription = "Blue son manna drought";
                break;
                
            case 5:
                eventLength = 1;
                eventDescription = "Red sun manna flux";
                break;
            
            case 6:
                eventLength = 1; 
                eventDescription = "Red sun manna drought.";
                break;
                
            case 7:
                eventLength = 1;
                eventDescription = "Elven high holy day.";
                break;
               
            case 8:
                eventLength = 1;
                eventDescription = "Season of the midnight sun.";
                break;
                
            case 9:
                eventLength = 1;
                eventDescription = "Church declares a special communion as a tribute to the Emperor.";
                break;
                
            case 10:
                eventLength = 1;
                eventDescription = "Dwarrows hold a folk moot.";
                break;
                
            case 11:
                eventLength = 1;
                eventDescription = "Conjunction of fear.";
                break;
            
            case 12:
                eventLength = 1;
                eventDescription = "Corfluite collation.";
                break;
                
            case 13:
                eventLength = 3;
                eventDescription = "Drought.";
                break;
                
            case 14:
                eventLength = 1;
                eventDescription = "Flooding.";
                break;
                
            case 15:
                eventLength = 1;
                eventDescription = "Earthquake.";
                break;
                
            case 16:
                eventLength = 1;
                eventDescription = "Windstorm.";
                break;
                
            case 17:
                eventLength = 1;
                eventDescription = "Mount GreyMoore and mount Gerlod erupt.";
                break;
                
            case 18:
                eventLength = 1;
                eventDescription = "The Mistral is blowing.";
                break;
                
            case 19:
                eventLength = 1;
                eventDescription = "Vortex storm.";
                break;
                
            case 20:
                if (inEvent != 13) {
                    eventLength = 1;
                    eventDescription = "Killer penguin migration";
                    break;
                }//if
            
            case 21:
                eventLength = 1;
                eventDescription = "Poisonous piranha infestation.";
                break;
                
            default:
                break;
        }//case 
        
    }//RandomEventTable()
            
    public int EventKey() {
        
        return eventKey;
        
    }//EventKey
    
    public int EventLength() {
        
        return eventLength;
        
    }//EventLength
    
    public String EventDescription(){
        
        return eventDescription;
        
    }//EventDescription
    
            
}//class
