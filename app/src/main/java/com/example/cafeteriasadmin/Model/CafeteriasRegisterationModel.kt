package com.example.cafeteriasadmin.Model

import com.google.gson.annotations.SerializedName

class CafeteriasRegisterationModel {
    @SerializedName("id")
    val id: String? = null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("phone")
    val phone: String? = null

    @SerializedName("cafeteria")
    val cafeteria: String? = null

    @SerializedName("role")
    val role: String? = null

    @SerializedName("expir_date")
    val expir_date: String? = null

    @SerializedName("created_at")
    var created_at: String? = null

    @SerializedName("updated_at")
    var updated_at: String? = null
}