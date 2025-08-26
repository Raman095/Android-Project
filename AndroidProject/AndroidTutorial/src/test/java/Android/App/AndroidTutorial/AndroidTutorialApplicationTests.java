package Android.App.AndroidTutorial;

import Android.App.AndroidTutorial.model.employee.Employee;
import Android.App.AndroidTutorial.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AndroidTutorialApplicationTests {

    @Autowired
    private EmployeeDao employeeDao;

	@Test
	void employeeTest() {
        Employee employee = new Employee();
        employee.setName("Vivek");
        employee.setLocation("India");
        employee.setBranch("Swiggy");
        employeeDao.save(employee);
	}

    //@Test
    void getALlEmployeesAndDeleteThem() {
        List<Employee> employees = employeeDao.getAllEmployees();
        for(Employee employee: employees) {
            employeeDao.delete(employee.getId());
        }
    }
}