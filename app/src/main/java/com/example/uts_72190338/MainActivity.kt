package com.example.uts_72190338

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_72190338.adapter.UsersAdapter
import com.example.uts_72190338.model.ResponseUsersItem
import com.example.uts_72190338.model.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var rvUser : RecyclerView

        rvUser = findViewById(R.id.rvMkAPI)
        NetworkConfig().getService()
            .getUsers()
            .enqueue(object : Callback<List<ResponseUsersItem>> {
                override fun onFailure(call: Call<List<ResponseUsersItem>>, t:
                Throwable) {
                    Toast.makeText(this@MainActivity, t.localizedMessage,
                        Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(
                    call: Call<List<ResponseUsersItem>>,
                    response: Response<List<ResponseUsersItem>>
                ) {
                    rvUser.apply{
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        adapter = UsersAdapter(response.body())
                    }
                }
            })
    }
}