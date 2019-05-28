package app.mapperintf;

import app.pojo.Employee;
import app.pojo.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target = "employeeId", source = "entity.id"),
            @Mapping(target = "employeeName", source = "entity.name")
    })
    EmployeeDTO empoyeeToEmployeeDTO(Employee entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.employeeId"),
            @Mapping(target = "name", source = "dto.employeeName")
    })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);
}
