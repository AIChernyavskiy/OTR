package otr;


import java.util.*;

public class PrintTelephone {

    private final String fio;
    private Map<String, List<String>> map = new HashMap<>();

    public PrintTelephone(String fio) {
        this.fio = fio;
        addItems();
    }

    private void addItems() {
        List<String> listIvanov = new ArrayList<>();
        List<String> listPetrov = new ArrayList<>();
        List<String> listSidorov = new ArrayList<>();
        listIvanov.add("+8 800 2000 500");
        listIvanov.add("+8 800 200 600");
        map.put("Иванов И.И.", listIvanov);
        listPetrov.add("+8 800 2000 700");
        map.put("Петров П.П.", listPetrov);
        listSidorov.add("+8 800 2000 800");
        listSidorov.add("+8 800 2000 900");
        listSidorov.add("+8 800 2000 000");
        map.put("Сидоров С.С.", listSidorov);

    }

    public void checkFio() {
        if (map.containsKey(fio)) {
            printNumber();
        } else {
            System.out.println("Такого ФИО нет в БД");
        }
    }

    private void printNumber() {
        if ((map.get(fio)).isEmpty()) {
            System.out.println("Такого ФИО нет в БД");
        } else {
            for (String s : (map.get(fio))) {
                System.out.println(s);
            }
        }
    }

    public String getFio() {
        return fio;
    }
}

