package abstractFactory.guiElements.factories;

import abstractFactory.guiElements.buttons.Button;
import abstractFactory.guiElements.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
