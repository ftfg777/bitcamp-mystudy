package study.patterns.ex02.after2;

public class Test05 {

  public static void main(String[] args) {
    ContentPrinter contentPrinter = new ContentPrinter();
    SignPrinter signPrinter = new SignPrinter(contentPrinter, "정찬우");
    signPrinter.print("안녕하세요");
  }
}
