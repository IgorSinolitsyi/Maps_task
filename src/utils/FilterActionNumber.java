package utils;

import task_01_02.HashMapOrder;
import task_03.LinkedHashMapContacts;

import static utils.GetActionNumber.getMapContactsActionNumber;
import static utils.GetActionNumber.getMapOrderActionNumber;

public class FilterActionNumber {

    public static void filterMainMenuActionNumber(int option, HashMapOrder order, LinkedHashMapContacts contacts) {

        switch (option) {
            case 1 -> {
                if (!order.getOrder().isEmpty()) {
                    System.out.println("Перечень товаров не пуст");
                    int number;
                    do {
                        number = getMapOrderActionNumber();
                        filterActionMapOrderNumber(number ,order);
                    }while (number!=4);
                } else order.newOrder();

            }
            case 2 -> {
                order.editOrder();
            }
            case 3 -> {
                order.addProductToOrder();
            }
            case 4 -> {
                order.viewOrder();
            }
            case 5 -> {
                order.showProductQuantity();
            }
            case 6 -> {
                contacts.newContacts();

                if (!contacts.getContacts().isEmpty()) {
                    System.out.println("Перечень контактов не пуст");
                    int number;
                    do {
                        number = getMapContactsActionNumber();
                        filterActionMapContactsNumber(number ,contacts);
                    }while (number!=4);
                } else contacts.newContacts();

            }
            case 7 -> {
                contacts.editContact();
            }
            case 8 -> {
                contacts.viewContacts();
            }
            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
    }

    public static void filterActionMapOrderNumber(int option, HashMapOrder order) {

        switch (option) {
            case 1 -> {
                order.viewOrder();
            }
            case 2 -> {
                order.newOrder();
            }
            case 3 -> {
                order.clearOrder();
                order.newOrder();
            }
            case 4 -> {
            }
            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
    }

    public static void filterActionMapContactsNumber(int option, LinkedHashMapContacts contacts) {

        switch (option) {
            case 1 -> {
                contacts.viewContacts();
            }
            case 2 -> {
                contacts.newContacts();
            }
            case 3 -> {
               contacts.clearContacts();
               contacts.newContacts();
            }
            case 4 -> {
            }
            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
    }
}