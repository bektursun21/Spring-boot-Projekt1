package peaksoft.appplaza.mapper;

import org.springframework.stereotype.Component;
import peaksoft.appplaza.model.dto.AppRequest;
import peaksoft.appplaza.model.dto.AppResponse;
import peaksoft.appplaza.model.entityes.Application;

@Component
public class ApplicationMapper {

    public Application mapToEntity(AppRequest request) {
        Application application = new Application();
        application.setName(request.getName());
        application.setAge(request.getAge());
        application.setDescription(request.getDescription());
        application.setDeveloper(request.getDeveloper());
        application.setVersion(request.getVersion());
        application.setGenreName(request.getGenreName());
        return application;
    }

    public AppResponse mapToAppResponse(Application application) {
        return AppResponse.builder()
                .id(application.getId())
                .name(application.getName())
                .age(application.getAge())
                .description(application.getDescription())
                .developer(application.getDeveloper())
                .version(application.getVersion())
                .status(application.getStatus())
                .genreName(application.getGenreName())
                .localDate(application.getLocalDate()).build();
    }

}
