package app.pojo.sample;

import lombok.Data;

@Data
public class SimpleDestination {
    private String name;

    public String getName() {
        return name;
    }
}
