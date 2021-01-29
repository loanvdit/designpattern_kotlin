package com.example.basic.pattern.builder.builder

import com.example.basic.pattern.builder.model.Employee
import com.example.basic.pattern.builder.model.type.Affiliation
import com.example.basic.pattern.builder.model.type.Subsection
import com.example.basic.pattern.builder.model.type.Unit

class EmployeeBuilder:IEmployeeBuilder {
    private lateinit var affiliation:Affiliation
    private lateinit var subsection:Subsection
    private lateinit var unit: Unit
    private lateinit var name:String
    private var id:Int = 0

    override fun affiliation(affiliation: Affiliation): IEmployeeBuilder {
        this.affiliation = affiliation
        return this
    }

    override fun subsection(subsection: Subsection): IEmployeeBuilder {
        this.subsection = subsection
        return this
    }

    override fun unit(unit: Unit): IEmployeeBuilder {
        this.unit = unit
        return this
    }

    override fun name(name: String): IEmployeeBuilder {
        this.name = name
        return this
    }

    override fun id(id: Int): IEmployeeBuilder {
        this.id = id
        return this
    }

    override fun build(): Employee {
        return Employee(this.affiliation, this.subsection, this.unit, this.name, this.id)
    }
}