package com.zia.controller

import com.zia.model.Student
import com.zia.persistence.StudentRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(var repository: StudentRepository) {
    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addStudent(@RequestBody student: Student) = repository.save(student)

    @PutMapping("/{studentId}")
    fun updateStudent(@PathVariable studentId: Long, @RequestBody student: Student) {
        assert(student.studentId == studentId)
        repository.save(student)
    }

    @DeleteMapping("/{studentId}")
    fun removeStudent(@PathVariable studentId: Long) = repository.delete(studentId)

    @GetMapping("/{studentId}")
    fun getBytudentId(@PathVariable studentId: Long) = repository.findOne(studentId)
}