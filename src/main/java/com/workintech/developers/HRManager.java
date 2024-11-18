package com.workintech.developers;

public class HRManager extends Employee {
    JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    MidDeveloper[] midDevelopers = new MidDeveloper[10];
    SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];






    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working.");
        setSalary(getSalary() + 500);
    }
}