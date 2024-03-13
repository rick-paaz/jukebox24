package model;

import java.time.LocalDate;

// This class name is just a suggestion. 
// The account will need to use the type LocalDate
public class JukeboxAccount {
  
    private LocalDate today;

    public JukeboxAccount(String name) {
      today = LocalDate.now();
      System.out.println("Hey " + name + ", this is just a start. Today is " + today );
    }

}
