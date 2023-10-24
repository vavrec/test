package cz.vavrecka.test.repository

import cz.vavrecka.test.model.User
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserRepository {

    private val userList = Collections.synchronizedList(
            listOf(User(UUID.randomUUID(), "rex"),
                    User(UUID.randomUUID(), "mex"),
                    User(UUID.randomUUID(), "fex"),
                    User(UUID.randomUUID(), "dex")
            )
    )


    fun getAllUsers(): MutableList<User> = userList

}