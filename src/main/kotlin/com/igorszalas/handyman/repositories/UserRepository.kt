package com.igorszalas.handyman.repositories

import com.igorszalas.handyman.models.User
import jakarta.transaction.Transactional
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Transactional
@Repository
interface UserRepository : CrudRepository<User, Long> {

    fun findUserByName(name: String): List<User>?

    fun findUserById(id: Int): User?

    fun findUsersByCity(city: String): List<User>?

    fun deleteUserById(id: Int): Any

}