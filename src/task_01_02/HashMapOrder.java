package task_01_02;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static utils.DoubleSpaceKiller.doubleSpaceKiller;
import static utils.GetDataScanner.getDataScanner;

public class HashMapOrder {
    private HashMap<String, Integer> order;

    public HashMapOrder(HashMap<String, Integer> order) {
        this.order = order;
    }

    public int findProductQuantity(String productName) {
        return order.getOrDefault(productName, 0);
    }

    public void showProductQuantity() {
        String productName = getDataScanner("Введите наименование товара для поиска: ");
        System.out.println("\nТовара с наименованием `" + productName + "` в количестве " + findProductQuantity(productName));
    }

    public void newOrder() {
        if (!order.isEmpty()) {
            if (getDataScanner("Перечень товаров не пуст, " +
                    "\nчтобы очистить введите 0: ").equals("0")) {
                order.clear();
            }
        }
        while (true) {
            addProductToOrder();
            if (getDataScanner("Завершить введите 0, продолжить нажмите enter : ").equals("0")) {
                break;
            }
        }
    }

    public void addProductToOrder() {
        order.put(doubleSpaceKiller(getDataScanner("Введите наименование товара: ")),
                Integer.parseInt(getDataScanner("количество: ")));
    }

    public void viewOrder() {
        AtomicInteger i = new AtomicInteger();
        order.forEach((key, value) -> System.out.println(i.incrementAndGet() + ". " + key + " " + value));
    }

    public void editOrder() {
        String productName = getDataScanner("Введите наименование товара для редактирования: ");
        if (order.containsKey(productName))
            order.put(productName, Integer.parseInt(getDataScanner("количество: ")));
        else System.out.println("Товар не найден");
    }

}



