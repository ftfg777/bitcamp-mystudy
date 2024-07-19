package study.patterns.ex02.after2;

public class Test03 {

  public static void main(String[] args) {
    ContentPrinter contentPrinter = new ContentPrinter();
    HeaderPrinter headerPrinter = new HeaderPrinter(contentPrinter, "인사말");
    FooterPrinter footerPrinter = new FooterPrinter(headerPrinter, "비트캠프");
    footerPrinter.print("안녕하세요");
  }
}
