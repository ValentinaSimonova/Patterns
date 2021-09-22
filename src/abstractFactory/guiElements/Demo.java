package abstractFactory.guiElements;

import abstractFactory.guiElements.app.Application;
import abstractFactory.guiElements.factories.GUIFactory;
import abstractFactory.guiElements.factories.MacOSFactory;
import abstractFactory.guiElements.factories.WindowsFactory;

/**
 * Демо-класс. Здесь все сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создает конкретные фабрики динамически исходя\
     * из конфигурации или окружения.
     */
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
