package com.java.day13;

public class MaxNum {

  public static void main(String[] args) {

    //Test case 1: max number at 1st position
    System.out.println("max= " + testMaximum(10, 2, 3));

    //Test case 1: max float number at 2nd position
    System.out.println("max= " + testMaximum(10f, 20f, 3f));

    //Test case 1: max string at 3rd position
    System.out.println("max= " + testMaximum("Chase", "Patric", "Ryan"));
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static <E extends Comparable> E testMaximum(E a, E b, E c) {
    E max; //only declaring because we can't initialize value here without knowing its type

    if (a.compareTo(b) > 0) {
      if (a.compareTo(c) > 0) max = a;
      else max = c;

    } else if (b.compareTo(c) > 0) max = b;
    else max = c;

    return max;
  }

}
