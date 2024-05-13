package com.igorszalas.handyman.controllers

import com.igorszalas.handyman.models.Announcement
import com.igorszalas.handyman.repositories.AnnouncementRepository

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/announcement")
class AnnouncementController(val announcementRepository: AnnouncementRepository){
    @GetMapping("/")
    fun announcementTest(): String {
        return "Test announcement"
    }

    @GetMapping("/all")
    fun getAllAnnouncements(): List<Announcement> = announcementRepository.findAll()

    @GetMapping("/title/{title}")
    fun getAnnouncementsByTitle(@PathVariable("title") title: String): Optional<List<Announcement>> = announcementRepository.findAnnouncementByTitle(title);
}