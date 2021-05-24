package org.zhiyu.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departNumber;
    private String departName;
    private List<Staff> staffList = new ArrayList<>();

    public Department(String departNumber, String departName) {
        this.departNumber = departNumber;
        this.departName = departName;
    }

    public String getDepartNumber() {
        return departNumber;
    }

    public void setDepartNumber(String departNumber) {
        this.departNumber = departNumber;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public void addStaff(Staff staff) {
        this.staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        this.staffList.remove(staff);
    }

    public String getStaffQuantity () {
        return this.departName + "总共有" + this.staffList.size() + "名员工";
    }
}