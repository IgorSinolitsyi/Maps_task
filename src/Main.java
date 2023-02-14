import task_01_02.HashMapOrder;
import task_03.LinkedHashMapContacts;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static utils.FilterActionNumber.filterMainMenuActionNumber;
import static utils.GetActionNumber.getMainMenuActionNumber;

public class Main {
    public static void main(String[] args) {

        HashMapOrder hashMapOrder = new HashMapOrder(new HashMap<>());
        LinkedHashMapContacts linkedHashMapContacts = new LinkedHashMapContacts(new LinkedHashMap<>());

        while (true) filterMainMenuActionNumber(getMainMenuActionNumber(),hashMapOrder,linkedHashMapContacts);

    }
}