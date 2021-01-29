package com.example.basic.pattern.abstractfactory

import com.example.basic.pattern.abstractfactory.impl.PlasticFactory
import com.example.basic.pattern.abstractfactory.impl.WoodFactory

class FurnitureFactory {
    companion object {
        fun getFactory(instance: MaterialType):FurnitureAbstractFactory {
            return when(instance) {
                MaterialType.PLATTICS -> {
                    PlasticFactory()
                }
                MaterialType.WOOD -> {
                    WoodFactory()
                }
            }
        }
    }
}