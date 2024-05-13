package com.igorszalas.handyman.models

import jakarta.persistence.*
import com.igorszalas.handyman.enums.AnnouncementCategory

@Entity
data class Announcement(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?,
    var title: String?,
    var content: String?,
    var category: AnnouncementCategory?,
    var authorId: Int?
)