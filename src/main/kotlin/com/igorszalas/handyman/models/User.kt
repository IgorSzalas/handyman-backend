package com.igorszalas.handyman.models

import com.igorszalas.handyman.enums.UserRole
import jakarta.persistence.*

@Entity
@Table(name = "Users")
data class User(
    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?,
    @Column(name = "FirstName")
    var name: String?,
    @Column(name = "LastName")
    var surname: String?,
    @Column(name = "Address")
    var address: String?,
    @Column(name = "City")
    var city: String?,
    @Column(name = "UserDescription")
    var description: String?,
    // @Value(UserRole.NORMAL)
    @Column(name = "UserRole")
    var role: UserRole
)
