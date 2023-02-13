package utils;

public class GetActionNumber {
    public static int getActionNumber() {
        String actionChoice;
        String CHOOSE_TASK_VIEW = """
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
        System.out.println("\n" + CHOOSE_TASK_VIEW);
        do {
            actionChoice = GetDataScanner.getDataScanner("Введите номер задания" + "\n");
        }
        while (!ValidateChoice.isActionChoice(actionChoice));

        return Integer.parseInt(actionChoice);
    }
}
