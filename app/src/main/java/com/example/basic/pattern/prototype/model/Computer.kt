package com.example.basic.pattern.prototype.model

class Computer {
    private var os: String = ""
    private var version: String = ""
    private var office: String = ""
    private var antivirus:Boolean = false

    constructor(os: String, version: String, office: String, antivirus: Boolean) {
        this.os = os
        this.version = version
        this.office = office
        this.antivirus = antivirus
    }

    override fun toString(): String {
        val out = StringBuilder()
        out.append("Employee details: \n")
        out.append(String.format("OS: %s\n", this.os))
        out.append(String.format("Version: %s\n", this.version))
        out.append(String.format("Office: %s\n", this.office))
        out.append(String.format("Antivirus: %s\n", this.antivirus.toString()))
        print(out.toString())
        return out.toString()
    }
}