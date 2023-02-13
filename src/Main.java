import task_01_02.HashMapOrder;
import task_03.LinkedHashMapContacts;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static utils.FilterActionNumber.filterActionNumber;
import static utils.GetActionNumber.getActionNumber;

public class Main {
    public static void main(String[] args) {

        HashMapOrder hashMapOrder = new HashMapOrder(new HashMap<>());
        LinkedHashMapContacts linkedHashMapContacts = new LinkedHashMapContacts(new LinkedHashMap<>());

        while (true) filterActionNumber(getActionNumber(),hashMapOrder,linkedHashMapContacts);

    }
}