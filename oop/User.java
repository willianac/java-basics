package oop;

import java.time.LocalDate;

public class User {
  private String name;
  private LocalDate birthDay;
  
  User(String name, String birthDay) {
    this.name = name;
    this.birthDay = LocalDate.parse(birthDay);
  }

  public String getName() {
    return this.name;
  }
  public LocalDate getBirthDay() {
    return this.birthDay;
  }
}
