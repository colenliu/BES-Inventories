package Stock;

import java.util.ArrayList;


public class ReflexiveDepartmentExample {
    private ArrayList<ReflexiveItemExample> items;
    private String departmentname;

    public void addItem(ReflexiveItemExample ri) {
        if (!items.contains(ri)) {
            items.add(ri);
            ri.addDepartment(this);
        }
    }
}
