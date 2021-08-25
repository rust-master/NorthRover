package com.miti.northrover.Model

class UserModel {
    var name: String? = null
    var email: String? = null
    var phone: String? = null
    var address: String? = null

    constructor()

    constructor(name: String?, email: String?, phone: String?, address: String?) {
        this.name = name
        this.email = email
        this.phone = phone
        this.address = address
    }
}