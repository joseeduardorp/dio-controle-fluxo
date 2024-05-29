package Counter;

import Exceptions.InvalidParametersException;

public class Counter {
  public void count(int firstParam, int secondParam) throws InvalidParametersException {
    if (firstParam >= secondParam) {
      throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int counter = secondParam - firstParam;

    for (int num = 0; num < counter; num++) {
      System.out.println("Imprimindo o número " + num);
    }
  }
}
