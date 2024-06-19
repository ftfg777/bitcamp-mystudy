package bitcamp.myapp.command;


import static bitcamp.myapp.util.Prompt.input;
import static bitcamp.myapp.util.Prompt.inputInt;

import bitcamp.myapp.vo.Board;

public class BoardCommand {

    private static final int MAX_SIZE = 100;
    private static Board[] boards = new Board[MAX_SIZE];
    private static int boardLength = 0;


    public static void executeBoardCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                addBoard();
                break;
            case "조회":
                viewBoard();
                break;
            case "목록":
                listBoard();
                break;
            case "변경":
                updateBoard();
                break;
            case "삭제":
                deleteBoard();
                break;
        }

    }

    private static void addBoard() {
        Board board = new Board(
            input("제목?"), input("내용?"));

        boards[boardLength++] = board;

        System.out.println("등록했습니다.");

    }


    private static void listBoard() {
        System.out.println("번호 제목 작성일 조회수");

        for (int i = 0; i < boardLength; i++) {
            Board board = boards[i];
            System.out.printf("%d %s %s %d\n",
                (i + 1), board.getTitle(), board.getWriteDate(), board.getViewCount());
        }
    }

    private static void viewBoard() {
        int boardNo = inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        Board board = boards[boardNo - 1];
        board.viewCountUp();

        System.out.printf("제목: %s\n", board.getTitle());
        System.out.printf("내용: %s\n", board.getContent());
        System.out.printf("작성일: %s\n", board.getWriteDate());
        System.out.printf("조회수: %d\n", board.getViewCount());
    }

    private static void updateBoard() {
        int boardNo = inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }
        Board board = boards[boardNo - 1];
        board.setTitle(input("제목(%s)?", board.getTitle()));
        board.setContent(input("내용(%s)?", board.getContent()));

        System.out.println("변경하였습니다.");
    }

    private static void deleteBoard() {
        int boardNo = inputInt("게시글 번호?");
        if (boardNo < 1 || boardNo > boardLength) {
            System.out.println("없는 게시글입니다.");
            return;
        }

        for (int i = boardNo; i < boardLength; i++) {
            boards[i - 1] = boards[i];
        }
        boardLength--;
        boards[boardLength] = null;
        System.out.println("삭제됐습니다.");

    }


}
