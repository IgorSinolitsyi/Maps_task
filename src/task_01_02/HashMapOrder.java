package task_01_02;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import static utils.DoubleSpaceKiller.doubleSpaceKiller;
import static utils.GetDataScanner.getDataScanner;

public class HashMapOrder {
    private HashMap<String, Integer> order;

    public HashMap<String, Integer> getOrder() {
        return order;
    }


    public HashMapOrder(HashMap<String, Integer> order) {
        this.order = order;
    }
    public void clearOrder(){order.clear();}
    public int findProductQuantity(String productName) {
      return order.getOrDefault(productName,-1);}


    public void showProductQuantity() {
        String productName = getDataScanner("Введите наименование товара для поиска: ");
        int quantity = findProductQuantity(productName);
        if (quantity<0){System.out.println("Товара с наименованием " + productName + " не найден");}
        else System.out.println("\nТовара с наименованием `" + productName + "` в количестве " + quantity);
    }

    public void newOrder() {

        while (true) {
            addProductToOrder();
            if (getDataScanner("Завершить ввод товаров введите 0,\n" +
                    " продолжить ввод товаров нажмите enter : ").equals("0")) {
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



