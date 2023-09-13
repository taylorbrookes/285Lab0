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


public static void main(String[] args) {
  
  //method hasSameValue

  //define Array of Fractions
  Fraction[] fractionArray = new Fraction[100];
  for (int i = 0; i < fractionArray.length; i++) {
	 fractionArray[i] = new Fraction(i, i+1); 
  }
    

  //find most frequent value in array (joseph)
  //implement inserion sort (dorina)
  //implement recursive method (jove)
}



public Fraction findFrequent(Fraction[] input) {
	
	//count1 holds the number of copies of currently tested 
	int count1 = 0;
	int count2 = 0;
	
	Fraction current;
	Fraction frequent;
	
	for(int i = 0; i < input.length; i++) {
		
		current = input[i];
		
		for(int j = 0; j < input.length; j++) {
			
			if(current.toString().compareTo(input[j].toString()) == 0) {
				
				count1++; 
			}
			
		}
		
		if((count1-1)>count2) {
			
			frequent = current;
			count2 = count1-1;
			
		}
	}
	
	return frequent;
}
}