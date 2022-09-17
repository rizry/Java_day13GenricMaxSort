package com.java.day13;

public class MaxNum<E extends Comparable> {

  private E a, b, c;

  public MaxNum(E a, E b, E c) {
    this.a = a;
    this.b = b;
    this.c = c;

    this.testMaximum(); //constuctor calling the non static method testMaximum, which then calls static testMaximum method.
  }

  public E testMaximum() {
    E max = MaxNum.testMaximum(a, b, c);
    System.out.println("max is " + max);
    return max;
  }

  public static void main(String[] args) {
    //Test case 1: max number at 1st position
    MaxNum<Integer> intIns = new MaxNum<>(10, 2, 3); //creating named-object for type Integer

    //Test case 2: max float number at 2nd position
    new MaxNum<Float>(10f, 20f, 3f); //creating anonymous object for type Float

    //Test case 3: max string at 3rd position
    new MaxNum<String>("Chase", "Patric", "Ryan"); //creating anonymous object for type String

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
