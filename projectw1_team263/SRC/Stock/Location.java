package Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private Map<ReflexiveDepartmentExample, ReflexiveItemExample> location;
    private ReflexiveItemExample itemExample;

    public Location() {
        location = new HashMap<>();
        itemExample = new ReflexiveItemExample();
    }

    private void addReflexiveDepartment(ReflexiveDepartmentExample department) {
        location.put(department,itemExample);
    }

    private void addReflexiveItemIntoReflexiveDepartment(ReflexiveDepartmentExample department, ReflexiveItemExample item) {
        ReflexiveItemExample items = location.get(department);
        items.addDepartment(item);
    }

//        private void findDepartmentOfItem(ReflexiveItemExample item) {
//            System.out.println("This item is in department: ");
//            ReflexiveItemExample items = location.get(item);
//            for (ReflexiveItemExample itemname : items) {
//                System.out.println(itemname);
//            }
//        }

}

