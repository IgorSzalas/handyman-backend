package com.igorszalas.handyman.repositories

import com.igorszalas.handyman.models.Announcement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AnnouncementRepository : JpaRepository<Announcement, Long>{

    fun findAnnouncementByTitle(name: String): Optional<List<Announcement>>
}