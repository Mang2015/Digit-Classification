package com.example.digitclassification;

import java.util.Vector;
import java.util.Arrays;
import java.util.ArrayList;

public class Perceptron {
  private int [] digit0 = new int[1024];
  private int [] digit1 = new int[1024];
  private int [] digit2 = new int[1024];
  private int [] digit3 = new int[1024];
  private int [] digit4 = new int[1024];
  private int [] digit5 = new int[1024];
  private int [] digit6 = new int[1024];
  private int [] digit7 = new int[1024];
  private int [] digit8 = new int[1024];
  private int [] digit9 = new int[1024];

  for (int i = 0; i < 1024; i++) {
    digit0[i] = 0;
    digit1[i] = 0;
    digit2[i] = 0;
    digit3[i] = 0;
    digit4[i] = 0;
    digit5[i] = 0;
    digit6[i] = 0;
    digit7[i] = 0;
    digit8[i] = 0;
    digit9[i] = 0;
  }
  public Perceptron(int[] digit0, int[] digit1, int[] digit2, int[] digit3, int[] digit4, int[] digit5, int[] digit6, int[] digit7, int[] digit8, int[] digit9) {
    perceptron = new ArrayList<int []>();
    perceptron.add(digit0);
    perceptron.add(digit1);
    perceptron.add(digit2);
    perceptron.add(digit3);
    perceptron.add(digit4);
    perceptron.add(digit5);
    perceptron.add(digit6);
    perceptron.add(digit7);
    perceptron.add(digit8);
    perceptron.add(digit9);
  }

}
