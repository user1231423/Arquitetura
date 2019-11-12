/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.rational;

import static java.util.Objects.hash;

/**
 *
 * @author joaogouveia
 */
public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    @Override
    public boolean equals (Object obj){
        if(this == obj){
            return true;
        }else if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Rational other =(Rational) obj;
        return denominator == other.denominator && numerator == other.numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public int compareTo(Rational obj) {
        return getNumerator() * obj.getDenominator() - obj.getNumerator() * getDenominator();
    }

    @Override
    public int hashCode() {
        return hash(this.numerator, this.denominator);
    }
    
}
