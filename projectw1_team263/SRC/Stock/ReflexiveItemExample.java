package Stock;

import java.util.ArrayList;
import java.util.Objects;

public class ReflexiveItemExample extends ReflexiveDepartmentExample {
   private ArrayList<ReflexiveDepartmentExample> department;
   private String itemName;

    public ReflexiveItemExample() {
//        this.department = department;
        this.itemName = itemName;
    }

    public void addDepartment(ReflexiveDepartmentExample rd) {
        if (!department.contains(rd)) {
            department.add(rd);
            rd.addItem(this);

        }
    }

    public String getReflexiveItemName() {
        return itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReflexiveItemExample that = (ReflexiveItemExample) o;
        return Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {

        return Objects.hash(department);
    }
}




