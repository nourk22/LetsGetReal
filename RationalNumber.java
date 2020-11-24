public class RationalNumber extends RealNumber{
    private int numerator, denominator;

    /**Initialize the RationalNumber with the provided values
    *  if the denominator is 0, make the fraction 0/1 instead
    *  If the denominator is negative, negate both numerator and denominator
    *@param nume the numerator
    *@param deno the denominator
    */

    public RationalNumber(int nume, int deno){
      super(0.0);//this value is ignored!
      if (deno == 0){
        numerator = 0;
        denominator = 1;
      } else if (deno < 0) {
        numerator = nume * -1;
        denominator = deno * -1;
      } else {
        numerator=nume;
        denominator=deno;
      }
      reduce();
    }

    public double getValue(){
      return ((double)numerator/(double)denominator);
    }

    /**
    *@return the numerator
    */

    public int getNumerator(){
      return numerator;
    }

    /**
    *@return the denominator
    */

    public int getDenominator(){
      return denominator;
    }

    /**
    *@return a new RationalNumber that has the same numerator
    *and denominator as this RationalNumber but reversed.
    */

    public RationalNumber reciprocal(){
      RationalNumber reciprocal = new RationalNumber(denominator, numerator);
      return reciprocal;
    }

    /**
    *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
    */

    public boolean equals(RationalNumber other){
      return (getNumerator()==other.getNumerator() && getDenominator()==other.getDenominator());
    }


    /**
    *@return the value expressed as "3/4" or "8/3"
    */

    public String toString(){
      return "" + numerator + "/" + denominator;
    }

    /**Calculate the GCD of two integers.
    *@param a the first integers
    *@param b the second integer
    *@return the value of the GCD
    */

    private static int gcd(int a, int b){
      /*use euclids method or a better one*/
      if (a==b){
        return a;
      }

      int first = 0;
      int second = 0;

      if (a>b){
        first =a ;
        second = b;
      }else{
        first = b;
        second = a;
      }

      int remainder = second;

      while (remainder != 0){
        remainder = first % second;
        first = second;
        second = remainder;
      }

      return first;
    }

    /**
    *Divide the numerator and denominator by the GCD
    *This must be used to maintain that all RationalNumbers are
    *reduced after construction.
    */

    private void reduce(){
      int gcd = gcd(numerator, denominator);
      numerator = getNumerator() / gcd;
      denominator = getDenominator() / gcd;
    }

    /******************Operations Return a new RationalNumber!!!!****************/
    /**
      Return a new RationalNumber that is the product of this and the other
    */
    public RationalNumber multiply(RationalNumber other){
      RationalNumber product = new RationalNumber(other.getNumerator() * getNumerator(), other.getDenominator() * getDenominator());
      return product;
    }

    /**
      Return a new RationalNumber that is the this divided by the other
    */

    public RationalNumber divide(RationalNumber other){
      RationalNumber division = new RationalNumber(other.getNumerator() * getDenominator(), other.getDenominator() * getNumerator());
      return division;
    }

    /**
      Return a new RationalNumber that is the sum of this and the other
    */

    public RationalNumber add(RationalNumber other){
      int common = other.getDenominator() * getDenominator();
      RationalNumber sum = new RationalNumber(other.getNumerator()*getDenominator() + getNumerator()*other.getDenominator(), common);
      return sum;
    }

    /**
      Return a new RationalNumber that this minus the other
    */

    public RationalNumber subtract(RationalNumber other){
      int common = other.getDenominator() * getDenominator();
      RationalNumber diff = new RationalNumber(getNumerator()*other.getDenominator() - other.getNumerator()*getDenominator(), common);
      return diff;
    }

    public static void main(String[] args){

    }
}
