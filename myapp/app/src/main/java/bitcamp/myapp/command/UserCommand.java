package bitcamp.myapp.command;


import static bitcamp.myapp.util.Prompt.input;
import static bitcamp.myapp.util.Prompt.inputInt;

import bitcamp.myapp.vo.User;

public class UserCommand {

    private static final int MAX_SIZE = 100;
    private static User[] users = new User[MAX_SIZE];
    private static int userLength = 0;


    public static void executeUserCommand(String command) {
        System.out.printf("[%s]\n", command);
        switch (command) {
            case "등록":
                addUser();
                break;
            case "조회":
                viewUser();
                break;
            case "목록":
                listUser();
                break;
            case "변경":
                updateUser();
                break;
            case "삭제":
                deleteUser();
                break;
        }

    }

    private static void addUser() {
        User user = new User();
        user.setName(input("이름?"));
        user.setEmail(input("이메일?"));
        user.setPassword(input("암호?"));
        user.setTel(input("연락처?"));

        users[userLength++] = user;
        System.out.println("등록됐습니다.");
    }


    private static void listUser() {
        System.out.println("번호 이름 이메일");

        for (int i = 0; i < userLength; i++) {
            User user = users[i];
            System.out.printf("%d %s %s\n", (i + 1), user.getName(), user.getEmail());
        }
    }


    private static void viewUser() {
        int userNo = inputInt("회원번호?");
        if (userNo < 1 || userNo > userLength) {
            System.out.println("없는 회원입니다");
            return;
        }
        User user = users[userNo - 1];
        System.out.printf("이름: %s\n", user.getName());
        System.out.printf("이메일: %s\n", user.getEmail());
        System.out.printf("연락처: %s\n", user.getTel());

    }


    private static void updateUser() {

        int userNo = inputInt("회원번호?");
        if (userNo < 1 || userNo > userLength) {
            System.out.println("없는 회원입니다");
            return;
        }
        User user = users[userNo - 1];
        user.setName(input("이름(%s)?", user.getName()));
        user.setEmail(input("이메일(%s)?", user.getEmail()));
        user.setPassword(input("암호는?"));
        user.setTel(input("연락처(%s)?", user.getTel()));

        System.out.println("변경했습니다.");
    }

    private static void deleteUser() {
        int userNo = inputInt("회원번호?");
        if (userNo < 1 || userNo > userLength) {
            System.out.println("없는 회원입니다");
            return;
        }
        // 다음 값을 앞으로 당긴다
        for (int i = userNo; i < userLength; i++) {
            users[i - 1] = users[i];
        }
        userLength--;
        users[userLength] = null;
        System.out.println("삭제됐습니다.");
    }


    public static User findByNo(int userNo) {
        if (userNo < 1 || userNo > userLength) {
            return null;
        }
        return users[userNo - 1];
    }
}
