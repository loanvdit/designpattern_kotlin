package com.example.basic.pattern.builder.model

import com.example.basic.pattern.builder.model.type.Affiliation
import com.example.basic.pattern.builder.model.type.Subsection
import com.example.basic.pattern.builder.model.type.Unit

class Employee {
    private var affiliation:Affiliation = Affiliation.HANOI
    private var subsection:Subsection = Subsection.NONE
    private var unit:Unit = Unit.POOL
    private var name:String = ""
    private var id:Int = 0

    constructor(affiliation: Affiliation, subsection: Subsection, unit: Unit, name: String, id: Int) {
        this.affiliation = affiliation
        this.subsection = subsection
        this.unit = unit
        this.name = name
        this.id = id
    }

    override fun toString(): String {
        val out = StringBuilder()
        out.append("Employee details: \n")
        out.append(String.format("ID: %s\n", this.id))
        out.append(String.format("Affiliation: %s\n", this.affiliation.toString()))
        out.append(String.format("Subsection: %s\n", this.subsection.toString()))
        out.append(String.format("Unit: %s\n", this.unit.toString()))
        out.append(String.format("Employee name: %s\n", this.name))
        print(out.toString())
        return out.toString()
    }
}