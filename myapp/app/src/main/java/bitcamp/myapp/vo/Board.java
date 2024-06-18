package bitcamp.myapp.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Board {

    private String title;
    private String content;
    private String writeDate;
    private int viewCount = 0;

    public Board() {
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;

        localDateFormat();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void viewCountUp() {
        this.viewCount++;
    }

    public String getWriteDate() {
        return writeDate;
    }
    

    private void localDateFormat() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        this.writeDate = currentDate.format(formatter);
    }
}
