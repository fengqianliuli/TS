package org.zhiyu.model;

public class Staff {
    /**
     * 员工名称
     */
    private String staffName;
    /**
     * 员工编号
     */
    private String staffNumber;
    /**
     * 员工年龄
     */
    private Integer staffAge;
    /**
     * 员工性别
     */
    private String staffSex;
    /**
     * 员工所属部门
     */
    private Department department;
    /**
     * 员工职位
     */
    private Post post;

    public Staff(String staffName, String staffNumber, Integer staffAge, String staffSex, Department department, Post post) {
        this.staffName = staffName;
        this.staffNumber = staffNumber;
        this.staffAge = staffAge;
        this.staffSex = staffSex;
        this.department = department;
        this.post = post;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        if (staffAge >= 18 && staffAge <= 65) {
            this.staffAge = staffAge;
        } else {
            this.staffAge = 18;
        }
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        if ("男".equals(staffSex) || "女".equals(staffSex)) {
            this.staffSex = staffSex;
        } else {
            this.staffSex = "男";
        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    /**
     * 员工自我介绍
     * @return data
     */
    public String selfIntroduction() {
        return "姓名:" + staffName + "\n" +
               "工号:" + staffNumber + "\n" +
               "性别:" + staffSex + "\n" +
               "年龄:" + staffAge + "\n" +
               "职务:" + department.getDepartName() + post.getPostName();
    }
}
