package com.java.day13;

import java.util.ArrayList;
import java.util.Collections;

public class FindMax<E extends Comparable> {

  private E a, b, c;

  public FindMax(E a, E b, E c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public E testMaximum(String option) {
    E max = FindMax.testMaximum(a, b, c, option);
    return max;
  }

  public static void main(String[] args) {
    //Test case 1: max int at 1st position
    FindMax<Integer> intIns = new FindMax<>(10, 2, 3);
    intIns.testMaximum("desc"); //calling the non-static method testMaximum which takes an option, and thats the fourth input for our static testMaximum method.

    //Test case 2: max float number at 2nd position
    FindMax<Float> floatIns = new FindMax<>(10f, 20f, 3f);
    floatIns.testMaximum("asc");

    //Test case 3: max string at 3rd position
    FindMax<String> stringIns = new FindMax<>("Patric", "Chase", "Ryan");
    stringIns.testMaximum("desc");

  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  public static <E extends Comparable> E testMaximum(E a, E b, E c, String option) {
    E max; //only declaring because we can't initialize value here without knowing its type

    ArrayList<E> arrList = new ArrayList<>(); //using ArrayList instead of arrays because normal arrays need to be assigned memory beforehand and we don't know before method execution what data-type to store in them

    arrList.add(a);
    arrList.add(b);
    arrList.add(c);

    if (a.compareTo(b) > 0) {
      if (a.compareTo(c) > 0) max = a;
      else max = c;

    } else if (b.compareTo(c) > 0) max = b;
    else max = c;

    switch (option) {
      case "asc":
        System.out.println("before sorting: " + arrList);
        Collections.sort(arrList);
        System.out.println("after sorting (asc): " + arrList);
        break;

      case "desc":
        System.out.println("before sorting: " + arrList);
        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("after sorting (desc): " + arrList);
        break;

      default:
        System.out.println("that option doesnt exist");
    }

    printMax(arrList, max); //internally calling printMax and passing arraylist and max as parameters to print them.

    return max;
  }

  public static <E> void printMax(ArrayList<E> list, E max) {
    System.out.print("the max among [");

    for (E l : list) System.out.print(l + " ");
    
    System.out.print("] is: " + max + "\n\n");
  }

}
