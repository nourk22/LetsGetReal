public class RealNumber extends Number{
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


  //equals method is in abstract class Number


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
    RealNumber division = new RealNumber(getValue() / other.getValue());
    return division;
  }

  /*
    Return a new RealNumber that has the value of:
    this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber diff = new RealNumber(getValue() - other.getValue());
    return diff;
  }


  public static void main(String[] args){
  }
}
