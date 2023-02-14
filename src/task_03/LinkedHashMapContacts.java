package task_03;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static utils.DoubleSpaceKiller.doubleSpaceKiller;
import static utils.GetDataScanner.getDataScanner;
import static utils.ValidateEMail.isEMail;

public class LinkedHashMapContacts {
    private LinkedHashMap<String, String> contacts;

    public LinkedHashMapContacts(LinkedHashMap<String, String> contacts) {
        this.contacts = contacts;
    }

    public LinkedHashMap<String, String> getContacts() {
        return contacts;
    }

    public void newContacts() {

        while (true) {
        addNewContact();
        if (getDataScanner("Завершить ввод контактов введите 0,\n" +
                " продолжить ввод контактов нажмите enter : ").equals("0")) {
            break;
        }
    }
}
    public void clearContacts(){contacts.clear();}
    public void addNewContact() {
        String email;
        String name = getDataScanner("Введите имя: ");

        while (true) {
            email = getDataScanner("Введите e-mail: ");
            if (email.equals("0")) System.exit(0);
            if (!isEMail(email)) System.out.println("Ошибка ввода адреса e-mail, попробуйте еще :). Или 0 чтобы выйти");
            else break;
        }
        contacts.put(doubleSpaceKiller(name), email);
    }


    public void viewContacts() {
        AtomicInteger i = new AtomicInteger();
        contacts.forEach((key, value) -> System.out.println(i.incrementAndGet() + ". " + key + " " + value));
    }


    public void editContact() {
        String productName = getDataScanner("Введите имя для редактирования адреса e-mail: ");
        if (contacts.containsKey(productName))
            contacts.put(productName, getDataScanner("e-mail: "));
        else System.out.println("Контакт не найден");
    }

}



