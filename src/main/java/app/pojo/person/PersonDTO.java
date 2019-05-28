package app.pojo.person;

import lombok.Data;

/**
 * If the id field of the source entity is null,
 * we want to generate a random id and assign it
 * to the destination keeping other property values as-is.
 */
@Data
public class PersonDTO {
    private String id;
    private String name;
}
