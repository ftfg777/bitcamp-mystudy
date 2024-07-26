package bitcamp.listener;

import bitcamp.context.ApplicationContext;

public interface ApplicationListener {

    void onStart(ApplicationContext ctx);     // 애플리케이션이 시작될 때 호출됨

    void onShutdown(ApplicationContext ctx);  // 애플리케이션이 종료될 때 호출됨

}
