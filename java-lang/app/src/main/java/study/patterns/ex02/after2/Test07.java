package study.patterns.ex02.after2;

public class Test07 {

  public static void main(String[] args) {
    ContentPrinter contentPrinter = new ContentPrinter();
    SignPrinter signPrinter = new SignPrinter(contentPrinter, "정찬우");
    HeaderPrinter headerPrinter = new HeaderPrinter(signPrinter, "편지");

    FooterPrinter footerPrinter = new FooterPrinter(headerPrinter, "비트캠프");

    footerPrinter.print("안녕하세요");
  }
}
