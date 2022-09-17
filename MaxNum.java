package com.java.day13;

public class MaxNum {

  public static void main(String[] args) {

    MaxNum maxNum = new MaxNum();

    //Test case 1: max number at 1st position
    System.out.println("max= " + maxNum.findMax("Luke", "Eli", "Conner"));

    //Test case 1: max number at 2nd position
    System.out.println("max= " + maxNum.findMax("Ethan", "Kyle", "Jayden"));

    //Test case 1: max number at 3rd position
    System.out.println("max= " + maxNum.findMax("Chase", "Patric", "Ryan"));
  }

  public String findMax(String a, String b, String c) {
    String max = "";

    if (a.compareTo(b) > 0) {
      if (a.compareTo(c) > 0) max = a;
      else max = c;

    } else if (b.compareTo(c) > 0) max = b;
    else max = c;

    return max;
  }
}
