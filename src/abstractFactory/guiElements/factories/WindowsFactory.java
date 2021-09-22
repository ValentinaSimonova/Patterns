package abstractFactory.guiElements.factories;

import abstractFactory.guiElements.buttons.Button;
import abstractFactory.guiElements.buttons.WindowsButton;
import abstractFactory.guiElements.checkboxes.Checkbox;
import abstractFactory.guiElements.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создает только продукты своей вариации
 * Конкретная фабрика (Windows)
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
