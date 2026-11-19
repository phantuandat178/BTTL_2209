package com.ute.studentmvvm.network

import com.ute.studentmvvm.model.Student

data class StudentDto(
    val id: Int,
    val name: String,
    val username: String,
    val email: String
)

fun StudentDto.toEntity(): Student {
    return Student(
        id = 1000 + id,
        fullName = name,
        studentCode = "API${2026000 + id}",
        email = email.lowercase(),
        gpa = ((300 + (id * 9) % 95) / 100.0),
        major = "Công Nghệ Thông Tin"
    )
}