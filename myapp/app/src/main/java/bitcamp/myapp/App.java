package bitcamp.myapp;

import java.util.Scanner;

public class App {

    static Scanner keyboardScanner = new Scanner(System.in);

    static String[] menus = new String[]{
        "회원",
        "팀",
        "프로젝트",
        "게시판",
        "도움말",
        "종료"
    };

    public static void main(String[] args) {

        printMenu();

        String command;
        while (true) {
            try {
                command = prompt();

                if (command.equals("menu")) {
                    printMenu();
                } else {
                    int menuNo = Integer.parseInt(command);
                    String menuTitle = getMenuTitle(menuNo);
                    
                    if (menuTitle == null) {
                        System.out.println("유효한 메뉴 번호가 아닙니다.");
                    } else if (menuTitle.equals("종료")) {
                        break;
                    } else {
                        System.out.println(menuTitle);
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
            }
        }
        System.out.println("종료합니다.");

        // 사용을 완료한 자원은 반환해야 다른 프로세스(프로그램)이 사용할 수 있다.
        // 단, JVM을 종료하면 JVM이 사용한 모든 자원은 강제 회수된다.
        // OS가 강제 회수한다.
        keyboardScanner.close();
    }

    static void printMenu() {
        String boldAnsi = "\033[1m";
        String redAnsi = "\033[31m";
        String resetAnsi = "\033[0m";

        String appTitle = "[팀 프로젝트 관리 시스템]";
        String line = "----------------------------------";

        System.out.println(boldAnsi + line + resetAnsi);
        System.out.println(boldAnsi + appTitle + resetAnsi);

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals("종료")) {
                System.out.printf("%s%d. %s%s\n", (boldAnsi + redAnsi), (i + 1), menus[i],
                    resetAnsi);
            } else {
                System.out.printf("%d. %s\n", (i + 1), menus[i]);
            }
        }
        System.out.println(boldAnsi + line + resetAnsi);
    }

    static boolean isValidateMenu(int menuNo) {
        return menuNo >= 1 && menuNo <= menus.length;
    }

    static String getMenuTitle(int menuNo) {
        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;
    }

    static String prompt() {
        System.out.print("> ");
        return keyboardScanner.nextLine();
    }
}
