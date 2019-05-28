package app.pojo.emp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
    private String employeeStartDt;

    public String getEmployeeStartDt() {
        return employeeStartDt;
    }

    public void setEmployeeStartDt(String employeeStartDt) {
        this.employeeStartDt = employeeStartDt;
    }

    public DivisionDTO getDivision() {
        return division;
    }

    public void setDivision(DivisionDTO division) {
        this.division = division;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", division=" + division +
                ", employeeStartDt='" + employeeStartDt + '\'' +
                '}';
    }
}
