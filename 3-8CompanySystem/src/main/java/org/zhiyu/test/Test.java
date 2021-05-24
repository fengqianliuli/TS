package org.zhiyu.test;

import org.zhiyu.model.Department;
import org.zhiyu.model.Post;
import org.zhiyu.model.Staff;

public class Test {
    public static void main(String[] args) {
        Department d001 = new Department("D001", "人事部");
        Department d002 = new Department("D002", "市场部");

        Post p001 = new Post("P001", "经理");
        Post p002 = new Post("P002", "助理");
        Post p003 = new Post("P003", "职员");

        Staff s001 = new Staff("张铭", "S001", 29, "男", d001, p001);
        d001.addStaff(s001);
        Staff s002 = new Staff("李艾爱", "S002", 21, "女", d001, p002);
        d001.addStaff(s002);
        Staff s004 = new Staff("孙超", "S004", 29, "男", d001, p003);
        d001.addStaff(s004);
        Staff s005 = new Staff("张美美", "S005", 26, "女", d002, p003);
        d002.addStaff(s005);
        Staff s006 = new Staff("蓝迪", "S006", 37, "男", d002, p001);
        d002.addStaff(s006);
        Staff s007 = new Staff("米莉", "S007", 24, "女", d002, p003);
        d002.addStaff(s007);

        d001.getStaffList().forEach(staff -> {
            System.out.println(staff.selfIntroduction());
            System.out.println("======================");
        });
        d002.getStaffList().forEach(staff -> {
            System.out.println(staff.selfIntroduction());
            System.out.println("======================");
        });
        System.out.println(d001.getStaffQuantity());
        System.out.println(d002.getStaffQuantity());
    }
}
