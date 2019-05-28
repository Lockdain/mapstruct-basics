package app.mapperintf;

import app.pojo.person.Person;
import app.pojo.person.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    @Mapping(target = "id", source = "person.id",
             defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDTO personToPersonDTO(Person person);
}
