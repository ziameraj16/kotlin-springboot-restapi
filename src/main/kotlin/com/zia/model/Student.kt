package com.zia.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Student(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var studentId: Long = 0,
        var firstName: String = "",
        var lastName: String = ""
)