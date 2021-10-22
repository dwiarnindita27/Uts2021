package com.example.uts_72190338.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_72190338.R
import com.example.uts_72190338.model.ResponseUsersItem

    class UsersAdapter(val users: List<ResponseUsersItem>?):
        RecyclerView.Adapter<UsersAdapter.UsersHolder>() {
        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): UsersHolder {
            return UsersHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.rv_mk, parent, false))
        }
        override fun onBindViewHolder(holder: UsersAdapter.UsersHolder,
                                      position: Int) {
            holder.bindUsers(users?.get(position))
        }
        override fun getItemCount(): Int {
            return users?.size ?: 0
        }
        class UsersHolder(view: View) : RecyclerView.ViewHolder(view) {
            lateinit var txtKode: TextView
            lateinit var txtNamaMk: TextView
            lateinit var txtHari: TextView
            lateinit var txtSesi: TextView
            lateinit var txtSks: TextView
            lateinit var txtNim: TextView
            fun bindUsers(users: ResponseUsersItem?) {
                itemView.apply {
                    txtKode = findViewById(R.id.kode)
                    txtNamaMk = findViewById(R.id.nama_mk)
                    txtHari = findViewById(R.id.hari)
                    txtSesi = findViewById(R.id.sesi)
                    txtSks = findViewById(R.id.sks)
                    txtNim = findViewById(R.id.nim_progmob)
                }
            }
        }
    }
