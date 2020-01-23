package edu.pdx.cs410J.aachan;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;

public class Leapyear {

  public Leapyear(){
  }

  public boolean isDivisibleBy400(int year){
    return (year % 400 == 0);
  }

  public boolean isDivisibleBy100ButNot400(int year) {
    return (year % 100 == 0 && year % 400 != 0);
  }

  public boolean isDivisibleBy4ButNot100(int year) {
    return (year % 4 == 0 && year % 100 != 0);
  }

  public boolean isDivisibleBy4(int year) {
    return (year % 4 == 0);
  }

  public boolean isLeapYear(int year){
    return isDivisibleBy4(year) && !isDivisibleBy100ButNot400(year) && isDivisibleBy4ButNot100(year) && isDivisibleBy4(year);
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}