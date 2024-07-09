package bitcamp.myapp.command;

public class HelpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("도움말입니다.");
    }
}
