package com.java.day13;

public class MaxNum {

  public static void main(String[] args) {

    MaxNum maxNum = new MaxNum();

    //Test case 1: max number at 1st position
    System.out.println("max= " + maxNum.findMax(10f, 2f, 3f));

    //Test case 1: max number at 2nd position
    System.out.println("max= " + maxNum.findMax(10f, 20f, 3f));

    //Test case 1: max number at 3rd position
    System.out.println("max= " + maxNum.findMax(10f, 20f, 30f));
  }

  public float findMax(Float a, Float b, Float c) {
    Float max = 0f;

    if (a.compareTo(b) > 0) {
      if (a.compareTo(c) > 0) max = a;
      else max = c;

    } else if (b.compareTo(c) > 0) max = b;
    else max = c;

    return max;
  }
}
