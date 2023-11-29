package peaksoft.appplaza.mapper;

import org.springframework.stereotype.Component;
import peaksoft.appplaza.model.dto.RegistrationRequest;
import peaksoft.appplaza.model.dto.RegistrationResponse;
import peaksoft.appplaza.model.dto.UserResponse;
import peaksoft.appplaza.model.entityes.User;
import peaksoft.appplaza.model.enums.Status;

import java.time.LocalDate;
@Component
public class UserMapper {

    //  Бул мутод реквесттен келген классты ентити класска откорот
    public User mapToEntity(RegistrationRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setLastName(request.getLastName());
        user.setAge(request.getAge());
        user.setEmail(request.getEmail());
        user.setStatus(Status.PREMIUM);
        user.setCreateDate(LocalDate.now());
        user.setSubscribe(request.isSubscribe());
        return user;
    }

    public RegistrationResponse mapToResponse(User user){
        return RegistrationResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .age(user.getAge())
                .status(user.getStatus())
                .response("Success Registered ").build();
    }

    public UserResponse mapToUserResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .lastName(user.getLastName())
                .age(user.getAge())
                .status(user.getStatus())
                .subscribe(user.isSubscribe())
                .createDate(user.getCreateDate()).build();
    }
}
