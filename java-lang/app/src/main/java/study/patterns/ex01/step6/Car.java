package study.patterns.ex01.step6;

public abstract class Car {
  String maker;
  String model;
  int cc;

  // 자동차가 어떻게 동작할 지 그 흐름을 정의 한다.
  // template method
  public void play() {
    start();
    run();
    stop();
  }


  protected abstract void start();
  protected abstract void run();
  protected abstract void stop();


}
