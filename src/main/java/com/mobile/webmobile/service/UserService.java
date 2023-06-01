package com.mobile.webmobile.service;


import com.mobile.webmobile.entity.User;
import com.mobile.webmobile.model.dto.UserDTO;
import com.mobile.webmobile.model.request.ChangePasswordRequest;
import com.mobile.webmobile.model.request.CreateUserRequest;
import com.mobile.webmobile.model.request.UpdateProfileRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDTO> getListUsers();

    Page<User> adminListUserPages(String fullName, String phone, String email, Integer page);

    User createUser(CreateUserRequest createUserRequest);

    void changePassword(User user, ChangePasswordRequest changePasswordRequest);

    User updateProfile(User user, UpdateProfileRequest updateProfileRequest);
}
