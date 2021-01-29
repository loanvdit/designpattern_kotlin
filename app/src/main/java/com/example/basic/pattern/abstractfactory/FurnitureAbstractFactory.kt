package com.example.basic.pattern.abstractfactory

import com.example.basic.pattern.abstractfactory.chair.Chair
import com.example.basic.pattern.abstractfactory.table.Table

public abstract class FurnitureAbstractFactory {
    public abstract fun createChair(): Chair
    public abstract fun createTable(): Table
}