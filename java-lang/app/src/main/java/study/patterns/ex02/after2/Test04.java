package study.patterns.ex02.after2;

public class Test04 {

  public static void main(String[] args) {
    ContentPrinter contentPrinter = new ContentPrinter();
    FooterPrinter footerPrinter = new FooterPrinter(contentPrinter, "비트캠프");
    footerPrinter.print("안녕하세요");
  }
}
