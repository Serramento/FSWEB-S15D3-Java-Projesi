package tr.com.workintech.task.main;

import tr.com.workintech.task.model.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import tr.com.workintech.task.model.Lists;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Serra", "Sarıhasan");
        Employee employee2= new Employee(2,"Ali","Alican");
        Employee employee3= new Employee(3, "Veli", "Velican");
        Employee employee4= new Employee(1, "Serra", "Sarıhasan");
        Employee employee5= new Employee(3, "Veli", "Velican");

        System.out.println(employee1);

        LinkedList<Employee> mainList = new LinkedList<>();
        LinkedList<Employee> repeatingList = new LinkedList<>();
        HashMap<Integer, Employee> nonRepeatingList = new HashMap<>();

        mainList.add(employee1);
        mainList.add(employee2);
        mainList.add(employee3);
        mainList.add(employee4);
        mainList.add(employee5);

        Lists lists= new Lists(mainList, repeatingList, nonRepeatingList);

        System.out.println(mainList);
        System.out.println(lists.organizeRepeatingList());








    }
}