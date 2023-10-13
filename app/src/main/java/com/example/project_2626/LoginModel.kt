package com.example.project_2626

class LoginModel {
    //variable
    var username = ""
    var password = ""
    //method/fc
    fun logincheck(): Boolean{
        if (username.equals("aan") && password.equals("1")) {
            return true
        }else{
                return false
        }
    }
}