public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  /*
    Return true when the values are within 0.001% of each other.
    Special case: if one is exactly zero, the other must be exactly zero.
  */

  public boolean equals (RealNumber other){
    return Math.round(other.getValue()*10000) == Math.round(getValue()*10000);
  }

  /*
    Return a new RealNumber that has the value of:
    the sum of this and the other
  */

  public RealNumber add(RealNumber other){
    //other can be ANY RealNumber, including a RationalNumber
    //or other subclasses of RealNumber (that aren't written yet)
    RealNumber sum = new RealNumber(other.getValue() + getValue());
    return sum;
  }

  /*
    Return a new RealNumber that has the value of:
    the product of this and the other
  */

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(other.getValue() * getValue());
    return product;
  }

  /*
    Return a new RealNumber that has the value of:
    this divided by the other
  */

  public RealNumber divide(RealNumber other){
    RealNumber division = new RealNumber(other.getValue() / getValue());
    return division;
  }

  /*
    Return a new RealNumber that has the value of:
    this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(other.getValue() / getValue());
    return difference;
  }


  public static void main(String[] args){
  }
}
