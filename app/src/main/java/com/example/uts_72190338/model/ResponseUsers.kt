package com.example.uts_72190338.model

import com.google.gson.annotations.SerializedName

data class ResponseUsers(

	@field:SerializedName("ResponseUsers")
	val responseUsers: List<ResponseUsersItem?>? = null
)

data class ResponseUsersItem(

	@field:SerializedName("database")
	val database: String? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("comment")
	val comment: String? = null,

	@field:SerializedName("version")
	val version: String? = null
)

data class DataItem(

	@field:SerializedName("hari")
	val hari: String? = null,

	@field:SerializedName("kode")
	val kode: String? = null,

	@field:SerializedName("nama_mk")
	val namaMk: String? = null,

	@field:SerializedName("sks")
	val sks: String? = null,

	@field:SerializedName("sesi")
	val sesi: String? = null,

	@field:SerializedName("nim_progmob")
	val nimProgmob: String? = null
)
