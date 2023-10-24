package cz.vavrecka.test.service

import cz.vavrecka.test.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {


    fun getAllUsers() = userRepository.getAllUsers()

}