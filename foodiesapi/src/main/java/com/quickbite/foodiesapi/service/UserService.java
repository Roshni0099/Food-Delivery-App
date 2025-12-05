package com.quickbite.foodiesapi.service;

import com.quickbite.foodiesapi.io.UserRequest;
import com.quickbite.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
