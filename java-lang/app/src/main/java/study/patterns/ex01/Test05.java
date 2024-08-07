package study.patterns.ex01;

import study.patterns.ex01.step5.Car;
import study.patterns.ex01.step5.CarFactory;
import study.patterns.ex01.step5.K7Factory;
import study.patterns.ex01.step5.SonataFactory;


// 5) 싱글톤 패턴
public class Test05 {
  public static void main(String[] args) {

    SonataFactory sonataFactory = SonataFactory.getInstance();
    K7Factory k7Factory = K7Factory.getInstance();

    printCar(sonataFactory);
    printCar(k7Factory);
  }

  static void printCar(CarFactory carFactory) {
    Car car = carFactory.createCar();
    System.out.println(car);

  }

}
