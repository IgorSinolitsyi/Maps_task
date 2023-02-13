package utils;

import task_01_02.HashMapOrder;
import task_03.LinkedHashMapContacts;

public class FilterActionNumber {

    public static void filterActionNumber(int option, HashMapOrder order, LinkedHashMapContacts contacts) {

        switch (option) {
            case 1 -> {
                order.newOrder();
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
}