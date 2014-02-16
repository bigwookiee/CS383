/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainSwordSorcery;

/**
 *  
 * @author David Klingenberg
 */


public class StellarConfiguration {
  int yellowSun;
  char redSun;
  boolean redSunAscendent;
  boolean redSunDescendent;
  char blueSun;
  
  public StellarConfiguration(char rSun){
      
      yellowSun = 1;
      redSun = rSun;
      
      if(Character.isUpperCase(redSun))
        Character.toLowerCase(redSun);
      
      switch (redSun) {
          case 'a' : 
              blueSun = 'g';
              break;
              
          case 'b' : 
              blueSun = 'h';
              break;
              
          case 'c' : 
              blueSun = 'i';
              break;
              
          case 'd' :
              blueSun = 'j';
              break;
              
          case 'e' :
              blueSun = 'k';
              break;
              
          case 'f' :
              blueSun = 'l';
              break;
              
          case 'g' : 
              blueSun = 'a';
              break;

          case 'h' : 
              blueSun = 'b';
              break;
              
          case 'i' : 
              blueSun = 'c';
              break;
              
          case 'j' :
              blueSun = 'd';
              break;
              
          case 'k' :
              blueSun = 'e';
              break;
              
          case 'l' :
              blueSun = 'f';
              break;      
      }
      
      SetSunPhase();
      
  }//StellarCongfiguration
  
  public void AdvanceSuns(){
      
      if (yellowSun < 27)
        yellowSun++;
      else
        yellowSun = 1;
      
      if (redSun < 'l')  //That first char is not a one, it is an L. 
        redSun++;
      else 
          redSun = 'a';
      
      if (blueSun < 'l')  //That first char is not a one, it is an L.
          blueSun++;
      else
          blueSun = 'a';
      
      SetSunPhase();
  }//AdvanceSuns()
  
  private void CheckMinorSunsPosition(char p1, char p2, char p3){
    if (redSun == p1 || redSun == p2 || redSun == p3){
                redSunAscendent = true;
                redSunDescendent = false;
                }
                else              
                  if (blueSun == p1 || blueSun == p2 || blueSun == p3){
                    redSunAscendent = false;
                    redSunDescendent = true;
                  }
                  else{
                    redSunAscendent = false;
                    redSunDescendent = false;
                  }
  }//CheckMinorSunsPosition(char p1, char p2, char p3)
  
  private void SetSunPhase(){
      switch (yellowSun) {
              case 1 :  
              case 2 :
                CheckMinorSunsPosition('c','d','e');
                break;                  
                  
              case 3 :
              case 4 :
                CheckMinorSunsPosition('d','e','f');
                break;                  
                  
              case 5 :                  
              case 6 :
                CheckMinorSunsPosition('e','f','g');
                break;
                  
              case 7 :
              case 8 :
              case 9 :
                CheckMinorSunsPosition('f','g','h');
                break;                  

              
              case 10 :
              case 11 :
                CheckMinorSunsPosition('g','h','i');
                break;        
      
              case 12 :
              case 13 :
                  CheckMinorSunsPosition('h','i','j');
                  break;
                  
              case 14 :
              case 15 :
                  CheckMinorSunsPosition('i','j','k');
                  break;
                  
              case 16:
              case 17 :
                  CheckMinorSunsPosition('j','k','l');
                  break;
                  
              case 18:
              case 19:
              case 20:
                  CheckMinorSunsPosition('k','l','a');
                  break;
                  
              case 21 :
              case 22 :
                  CheckMinorSunsPosition('l','a','b');
                  break;
                  
              case 23 :
              case 24 :
                  CheckMinorSunsPosition('a','b','c');
                  break;
                  
              case 25 :
              case 26 :
                  CheckMinorSunsPosition('b','c','d');
                  break;
                  
              case 27 :
                  CheckMinorSunsPosition('c','d','e');
                  break;
      }//switch       
  }//SetSunPhase()
          
  public boolean GetRedSunIsInAscension(){
      return redSunAscendent;
  }//GetRedSunIsInAscension()
  
  public boolean GetRedSunIsInDeclension(){
      return redSunDescendent;
  }//GetRedSunIsInDeclension(){
  
  public boolean GetBlueSunIsInAscension(){
     return redSunDescendent;
  }//GetBlueSunIsInAscension()
  
  public boolean GetBlueSunIsInDeclension(){
      return redSunAscendent;
  }//GetBlueSunIsInDeclension()
  
  public int GetYelloSunPosition(){
      return yellowSun;
  }//GetYelloSunPosition()
  
  public char GetRedSunPosition(){
      return redSun;
  }//GetRedSunPosition()
  
  public char GetBlueSunPosition(){
      return blueSun;
  }//GetBlueDunPosition()
}
