package tr.com.workintech.task.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
    private LinkedList<Employee> mainList;
    private LinkedList<Employee> repeatingList;
    private HashMap<Integer, Employee> nonRepeatingList;

    public Lists(LinkedList<Employee> mainList, LinkedList<Employee> repeatingList, HashMap<Integer, Employee> nonRepeatingList) {
        this.mainList = mainList;
        this.repeatingList = repeatingList;
        this.nonRepeatingList = nonRepeatingList;
    }

    public LinkedList<Employee> getMainList() {
        return mainList;
    }

    public LinkedList<Employee> getRepeatingList() {
        return repeatingList;
    }

    public HashMap<Integer, Employee> getNonRepeatingList() {
        return nonRepeatingList;
    }

    public LinkedList<Employee> organizeRepeatingList() {
        Iterator<Employee> iterator = mainList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (mainList.contains(employee)) {
                repeatingList.add(employee);
            }
        }
        return repeatingList;
    }
    
    public HashMap<Integer, Employee> organizeNonRepeatingList(){
        for(Employee employee: mainList){
            nonRepeatingList.put(employee.getId(), employee);
        }
        for(Employee employee: repeatingList){
            nonRepeatingList.remove(employee.getId(), employee);
        }
        return nonRepeatingList;
    }

    public LinkedList<Employee> finalMainList(){
        mainList.removeAll(repeatingList);
        return mainList;
    }

/*

for(Employee employee: mainList){
        if(mainList.contains(employee)){
            repeatingList.add(employee);
        }
    }
        return repeatingList;*/
}
