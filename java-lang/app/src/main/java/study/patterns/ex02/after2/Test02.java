package study.patterns.ex02.after2;

public class Test02 {

  public static void main(String[] args) {
    ContentPrinter printer = new ContentPrinter();
    HeaderPrinter header = new HeaderPrinter(printer, "공지사항");

    header.print("안녕하세요");
  }
}
