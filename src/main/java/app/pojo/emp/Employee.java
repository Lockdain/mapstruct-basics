package app.pojo.emp;

import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private Division division;
    private Date startDt;

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", division=" + division +
                ", startDt=" + startDt +
                '}';
    }
}
