package com.example.basic.pattern.builder.builder

import com.example.basic.pattern.builder.model.Employee
import com.example.basic.pattern.builder.model.type.Affiliation
import com.example.basic.pattern.builder.model.type.Subsection
import com.example.basic.pattern.builder.model.type.Unit

interface IEmployeeBuilder {
    fun affiliation(affiliation: Affiliation): IEmployeeBuilder
    fun subsection(subsection: Subsection): IEmployeeBuilder
    fun unit(unit: Unit): IEmployeeBuilder
    fun name(name:String): IEmployeeBuilder
    fun id(id:Int): IEmployeeBuilder
    fun build(): Employee
}