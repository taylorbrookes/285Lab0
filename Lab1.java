public interface INumber<T> {
  T plus(T input);
  T minus(T input);
  T divide(T input);
  T multiply(T input);
  void print();
}

public class Fraction implements INumber {
  //numerator
  //denominator
}

public static void main(String[] args) {
  
  //method hasSameValue

  //define Array of Fractions
  Fraction[] fractionArray = new Fraction[100];
  for (int i = 0; i < fractionArray.length; i++)
    fractionArray[i] = new Fraction(i, i+1);

  //find most frequent value in array (joseph)
  //implement inserion sort (dorina)
  //implement recursive method (jove)
}
