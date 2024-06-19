package study.oop.clazz;

public class Test03 {

  // nested class
  class B{} //non-static nested class

  static class C {} // static nested class
  Object obj1 = new Object() {};

  void m1() {
    class D {} // local class

    Object obj = new Object() {}; // anonymous class
  }


}

// package member class

class A {}
