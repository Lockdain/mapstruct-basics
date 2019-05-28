package app.mapperintf;

import app.pojo.emp.Division;
import app.pojo.emp.Employee;
import app.pojo.emp.EmployeeDTO;
import app.pojo.sample.SimpleDestination;
import app.pojo.sample.SimpleSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

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
        Division division = new Division();
        division.setId(2);
        division.setName("IT");
        employee.setDivision(division);
        employee.setStartDt(new Date());

        EmployeeDTO employeeDTO = employeeMapper.empoyeeToEmployeeDTO(employee);
        System.out.println("Employee: " + employee.toString());
        System.out.println("EmployeeDTO: " + employeeDTO.toString());

        assertNotNull(employeeDTO);
        assertEquals(employee.getId(), employeeDTO.getEmployeeId());
        assertEquals(employee.getName(), employeeDTO.getEmployeeName());
        assertEquals(employee.getDivision().getId(), employeeDTO.getDivision().getId());
        assertEquals(employee.getDivision().getName(), employeeDTO.getDivision().getName());
    }
}