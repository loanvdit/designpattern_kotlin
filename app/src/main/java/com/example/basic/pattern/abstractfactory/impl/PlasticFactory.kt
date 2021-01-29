package com.example.basic.pattern.abstractfactory.impl

import com.example.basic.pattern.abstractfactory.FurnitureAbstractFactory
import com.example.basic.pattern.abstractfactory.chair.Chair
import com.example.basic.pattern.abstractfactory.chair.PlasticChair
import com.example.basic.pattern.abstractfactory.table.PlasticTable
import com.example.basic.pattern.abstractfactory.table.Table

class PlasticFactory:FurnitureAbstractFactory() {
    override fun createChair(): Chair {
        return PlasticChair()
    }

    override fun createTable(): Table {
        return PlasticTable()
    }
}