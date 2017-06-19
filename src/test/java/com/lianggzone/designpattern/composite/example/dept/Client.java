package com.lianggzone.designpattern.composite.example.dept;

public class Client {
    public static void main(String[] args) {
        Dept dept = new SubDept("总办");
        dept.add(new SubDept("办公室"));
        dept.add(new SubDept("财务部"));

        Dept devDept = new SubDept("研发部");
        dept.add(devDept);

        Dept devDept1 = new SubDept("研发1部");
        Dept devDept2 = new SubDept("研发2部");
        devDept.add(devDept1);
        devDept.add(devDept2);

        dept.display(1);
    }
}
