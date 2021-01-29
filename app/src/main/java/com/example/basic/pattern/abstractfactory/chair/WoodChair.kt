package com.example.basic.pattern.abstractfactory.chair

class WoodChair:Chair {
    override fun create() {
        print("Create CHAIR by wood")
    }
}