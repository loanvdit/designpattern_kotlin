package com.example.basic.pattern.abstractfactory

fun main() {
    var fur:FurnitureAbstractFactory = FurnitureFactory.getFactory(MaterialType.PLATTICS)
    fur.createChair().create()

    fur.createTable().create()
}