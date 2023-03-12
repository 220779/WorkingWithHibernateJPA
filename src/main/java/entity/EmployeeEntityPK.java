package entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class EmployeeEntityPK implements Serializable {
    @Column(name = "idEmployee")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmployee;
    @Column(name = "departmentId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String departmentId;

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntityPK that = (EmployeeEntityPK) o;

        if (idEmployee != that.idEmployee) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployee;
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
