package com.upiiz.employes.models;

import java.util.Date;

public class Employes {
    private Long employee_id;
    private String first_name;
    private String last_name;
    private Date hire_date;
    private String position;

    public Employes(){}

    public Employes(Long employee_id, String first_name, String last_name, Date hire_date, String position) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.hire_date = hire_date;
        this.position = position;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
