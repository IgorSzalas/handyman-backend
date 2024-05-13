package com.igorszalas.handyman.controllers

import com.igorszalas.handyman.models.User
import com.igorszalas.handyman.repositories.UserRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/user")
class UserController(val userRepository: UserRepository){

    @GetMapping("/")
    fun test(): String {
        return "Test"
    }

    @GetMapping("/all")
    fun getAllUsers(): MutableIterable<User> = userRepository.findAll();

    @GetMapping("/id")
    fun getUserById(@RequestBody id: Int): User? = userRepository.findUserById(id);

    @GetMapping("/name/{name}")
    fun getUserByName(@PathVariable(value = "name") name: String ): List<User>? = userRepository.findUserByName(name)

    @GetMapping("/city/{city}")
    fun getUserByCity(@PathVariable(value = "city") city: String): List<User>? = userRepository.findUsersByCity(city)

    @PostMapping("/add")
    fun addUser(@RequestBody user: User) : User = userRepository.save(user);

    @DeleteMapping("/remove/{id}")
    fun deleteUserById(@PathVariable(value = "id") id: Int) = userRepository.deleteUserById(id);
}
