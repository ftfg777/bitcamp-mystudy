package study.patterns.ex02.after2;

public class Test06 {

  public static void main(String[] args) {
    ContentPrinter contentPrinter = new ContentPrinter();
    SignPrinter signPrinter = new SignPrinter(contentPrinter, "정찬우");
    HeaderPrinter headerPrinter = new HeaderPrinter(signPrinter, "편지");
    headerPrinter.print("안녕하세요");
  }
}
