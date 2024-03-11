/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clonagemdesignpattern;

/**
 *
 * @author eduardoasilvestre
 */
public final class ComplexNumber {
  private float real;
  private float imaginary;
  /**
  * Static factory method returns an object of this class.
  */
  public static ComplexNumber valueOf(float real, float imaginary) {
    return new ComplexNumber(real, imaginary);
  }

  /**
  * Caller cannot see this private constructor.
  *
  * The only way to build a ComplexNumber is by calling the static 
  * factory method.
  */
  private ComplexNumber(float real, float imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }



  //..elided
  
    public static void main(String[] args) {
        ComplexNumber cn1 = ComplexNumber.valueOf(10, 20);
    }
} 
