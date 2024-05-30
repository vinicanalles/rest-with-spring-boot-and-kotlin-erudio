package dev.vinicanalles.rest_with_spring_boot_and_kotlin_erudio.exceptions

import java.util.*

class ExceptionResponse(
    val timestamp: Date,
    val message: String?,
    val details: String
)