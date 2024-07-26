package bitcamp.myapp.listener;

import bitcamp.context.ApplicationContext;
import bitcamp.listener.ApplicationListener;

public class StyleApplicationListener implements ApplicationListener {

    @Override
    public void onStart(ApplicationContext ctx) {
        System.out.println("------------------------------------------");
    }

    @Override
    public void onShutdown(ApplicationContext ctx) {
        System.out.println("--------------------종료------------------");
    }
}
