package com.example.risingtest.src.main.myPage.signup.phone

import com.google.gson.annotations.SerializedName

data class PhoneResult (
    @SerializedName("validationCode") val validationCode: String
        )