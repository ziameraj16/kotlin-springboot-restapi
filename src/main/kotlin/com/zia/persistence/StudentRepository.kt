package com.zia.persistence

import com.zia.model.Student
import org.springframework.data.repository.CrudRepository

interface StudentRepository : CrudRepository<Student, Long> {
}