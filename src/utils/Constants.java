package utils;

public class Constants {
    public static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    public static final String VALID_MAINMENU_TASK_CHOICE_REGEX = "[0-8]";
    public static final String VALID_MAP_ORDER_TASK_CHOICE_REGEX = "[0-4]";
    public static final String CHOOSE_MAINMENU_TASK_VIEW = """
                Выбор действия:
                
                Задание 1,2
                1 - создать перечень элементов заказа
                2 - обновление товара
                3 - добавление товара
                4 - вывод перечня товаров
                5 - поиск количества по наименованию
                
                Задание 3
                6 - ввод начального перечня контактов
                7 - смена э-почты
                8 - вывод перечня контактов
                
                0 - выход
                """;
    public static final String CHOOSE_MAP_ORDER_TASK_VIEW = """
                Выбор действия:
                
                1 - вывод перечня товаров
                2 - добавление товара в существующий перечнь
                3 - создать новый перечень элементов заказа
                4 - вернуться в главное меню
                
                0 - закрыть приложение
                """;

    public static final String CHOOSE_MAP_CONTACTS_TASK_VIEW = """
                Выбор действия:
                
                1 - вывод перечня контактов
                2 - добавление контактов в существующий перечнь
                3 - создать новый перечень контактов
                4 - вернуться в главное меню
                
                0 - закрыть приложение
                """;
}
