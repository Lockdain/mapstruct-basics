package app.mapperintf;

import app.pojo.sample.SimpleDestination;
import app.pojo.sample.SimpleSource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
