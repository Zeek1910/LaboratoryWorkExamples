package com.zeek1910.laboratoryworkexamples

data class BaseResponse<T>(
    val info: Info,
    val results: List<T>
)
