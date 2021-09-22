package abstractFactory.guiElements.factories;

import abstractFactory.guiElements.buttons.Button;
import abstractFactory.guiElements.buttons.MacOSButton;
import abstractFactory.guiElements.checkboxes.Checkbox;
import abstractFactory.guiElements.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создает только продукты своей вариации
 * Конкретная фабрика MacOS
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
