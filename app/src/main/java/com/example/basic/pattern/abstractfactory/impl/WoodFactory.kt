package com.example.basic.pattern.abstractfactory.impl

import com.example.basic.pattern.abstractfactory.FurnitureAbstractFactory
import com.example.basic.pattern.abstractfactory.chair.Chair
import com.example.basic.pattern.abstractfactory.chair.WoodChair
import com.example.basic.pattern.abstractfactory.table.Table
import com.example.basic.pattern.abstractfactory.table.WoodTable

class WoodFactory:FurnitureAbstractFactory() {
    override fun createChair(): Chair {
        return WoodChair()
    }

    override fun createTable(): Table {
        return WoodTable()
    }
}