package bitcamp.myapp.command;

import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.util.Stack;

public abstract class AbstractCommand implements Command {

    String menuTitle;

    public AbstractCommand(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    @Override
    public void execute(Stack menuPath) {
        menuPath.push(menuTitle);

        printMenus();
        while (true) {
            String commend = Prompt.input("%s>", getMenuPathTitle(menuPath));
            if (commend.equals("menu")) {
                printMenus();
                continue;
            } else if (commend.equals("9")) { // 이전 메뉴 선택
                menuPath.pop();
                return;
            }

            try {
                int menuNo = Integer.parseInt(commend);
                String menuName = getMenuTitle(menuNo);
                if (menuName == null) {
                    System.out.println("유효한 메뉴 번호가 아닙니다.");
                    continue;
                }

                processMenu(menuName);

            } catch (NumberFormatException ex) {
                System.out.println("숫자로 메뉴 번호를 입력하세요.");
            }
        }
    }

    private void printMenus() {
        String[] menus = getMenus();
        System.out.printf("[%s]\n", menuTitle);
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), menus[i]);
        }
        System.out.println("9. 이전");
    }


    private boolean isValidateMenu(int menuNo) {
        String[] menus = getMenus();
        return menuNo >= 1 && menuNo <= menus.length;
    }

    private String getMenuTitle(int menuNo) {
        String[] menus = getMenus();
        return isValidateMenu(menuNo) ? menus[menuNo - 1] : null;
    }

    private String getMenuPathTitle(Stack menuPath) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < menuPath.size(); i++) {
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append("/");
            }
            stringBuilder.append(menuPath.get(i));
            // 문자열을 연결하는 과정에서 새 String 객체가 생성되고 기존 String 객체가 garbage 됨
            // 메모리 낭비가 심하다
        }
        return stringBuilder.toString();
    }


    protected abstract void processMenu(String menuName);

    protected abstract String[] getMenus();
}
