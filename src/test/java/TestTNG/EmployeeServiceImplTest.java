package TestTNG;

import com.testng.dao.EmployeeDAO;
import com.testng.model.Employee;
import com.testng.service.EmployeeServiceImpl;
import org.junit.BeforeClass;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thangnguyen-imac on 8/7/16.
 */
public class EmployeeServiceImplTest {

    @Mock
    EmployeeDAO employeeDAO;

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Spy
    List<Employee> employeeList = new ArrayList<Employee>();

    @Captor
    ArgumentCaptor<Employee> captor;


    @BeforeClass
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        employeeList = getEmployeeLists();
    }

    private List<Employee> getEmployeeLists() {
        return null;
    }
}
