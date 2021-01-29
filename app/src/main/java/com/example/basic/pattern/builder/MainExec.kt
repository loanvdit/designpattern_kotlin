package com.example.basic.pattern.builder

import com.example.basic.pattern.builder.builder.EmployeeBuilder
import com.example.basic.pattern.builder.model.Employee
import com.example.basic.pattern.builder.model.type.Affiliation
import com.example.basic.pattern.builder.model.type.Subsection
import com.example.basic.pattern.builder.model.type.Unit

fun main() {
    var employee: Employee = EmployeeBuilder().affiliation(Affiliation.HANOI).subsection(Subsection.DEVELOP).unit(Unit.BU7).name("Vu Dinh Loan").id(123).build()
    employee.toString()
}