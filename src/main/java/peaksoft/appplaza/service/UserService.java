package peaksoft.appplaza.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import peaksoft.appplaza.mapper.UserMapper;
import peaksoft.appplaza.model.dto.RegistrationRequest;
import peaksoft.appplaza.model.dto.RegistrationResponse;
import peaksoft.appplaza.model.dto.UserResponse;
import peaksoft.appplaza.model.entityes.User;
import peaksoft.appplaza.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {

    final UserRepository repository;
    final UserMapper userMapper;

    public RegistrationResponse registration(RegistrationRequest request) {
        User user = userMapper.mapToEntity(request);
        if (user.getName().length() < 2 || user.getLastName().length() < 2) {
            throw new RuntimeException("User Дин аты 2 символдон коп болсун !");
        }
        if (!user.getEmail().contains("@")) {
            throw new RuntimeException("email да @ символ камтылышы керек !");
        }
        repository.save(user);
        return userMapper.mapToResponse(user);
    }

    public UserResponse findById(Long id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found by id" + id));
        return userMapper.mapToUserResponse(user);
    }

    public List<UserResponse> findAll() {
        return repository.findAll().stream()
                .map(userMapper::mapToUserResponse).toList();
    }

    public UserResponse update(Long userId, RegistrationRequest request) {
        User oldUser = repository.findById(userId)
                .orElseThrow(() -> new RuntimeException("not found by id" + userId));
        oldUser.setName(request.getName());
        oldUser.setLastName(request.getLastName());
        oldUser.setAge(request.getAge());
        oldUser.setSubscribe(request.isSubscribe());
        oldUser.setEmail(request.getEmail());
        repository.save(oldUser);
        return userMapper.mapToUserResponse(oldUser);
    }

    public void removeById(Long userId) {
        User user = repository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found by id" + userId));
        repository.delete(user);
    }
}
