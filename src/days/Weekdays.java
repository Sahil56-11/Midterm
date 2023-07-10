/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
  enum Days {
  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
  }
  public void nameOfDay(String code)
     {
    switch(code.toUpperCase())
      {
      case "ONE":
        System.out.println(Days.Monday);
        break;
      case "TWO":
        System.out.println(Days.Tuesday);
        break;
      case "THREE":
        System.out.println(Days.Wednesday);
        break;
      case "FOUR":
        System.out.println(Days.Thursday);
        break;
      case "FIVE":
        System.out.println(Days.Friday);
        break;
      case "SIX":
        System.out.println(Days.Saturday);
        break;
      case "SEVEN":
        System.out.println(Days.Sunday);
        break;
    }
  
}
}


