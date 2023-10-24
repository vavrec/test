package cz.vavrecka.test.controller

import cz.vavrecka.test.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/users")
class UserController(val userService: UserService) {

    @GetMapping
    fun getAllUsers() = userService.getAllUsers()
}