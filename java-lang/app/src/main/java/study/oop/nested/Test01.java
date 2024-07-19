package study.oop.nested;

public class Test01 {

  interface Printer {
    void print();
  }

  public static void main(String[] args) {

    Printer obj = new Printer() {
      @Override
      public void print() {
        System.out.println("Hello obj!");
      }
    };

    Printer obj2;
    obj2 = new Printer() {
      @Override
      public void print() {
        System.out.println("Hello obj2");
      }
    };
    obj2.print();

    Printer obj3;
    obj = () -> {System.out.println("Hello obj3");};

    obj.print();

    new Printer() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    }.print();

    Printer printer = new Printer() {
      @Override
      public void print() {
        System.out.println("printer");
      }
    };
    printer.print();

    new Printer() {
      @Override
      public void print() {
        System.out.println("d");
      }
    }.print();

    Printer printer2;
    printer2 = () -> {System.out.println("dd");};

    printer2.print();


  }
}
