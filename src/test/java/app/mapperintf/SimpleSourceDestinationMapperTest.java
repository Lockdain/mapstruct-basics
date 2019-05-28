package app.mapperintf;

import app.pojo.Employee;
import app.pojo.EmployeeDTO;
import app.pojo.SimpleDestination;
import app.pojo.SimpleSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleSourceDestinationMapperTest {

    @Autowired
    private SimpleSourceDestinationMapper simpleSourceDestinationMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");
        SimpleDestination destination = simpleSourceDestinationMapper.sourceToDestination(simpleSource);

        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), destination.getDescription());
    }

    @Test
    public void givenEmployeeToEmployeeDTO_whenMaps_thenCorrect() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Alex");

        EmployeeDTO employeeDTO = employeeMapper.empoyeeToEmployeeDTO(employee);

        assertNotNull(employeeDTO);
        assertEquals(employee.getId(), employeeDTO.getEmployeeId());
        assertEquals(employee.getName(), employeeDTO.getEmployeeName());
    }
}