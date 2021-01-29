package com.example.basic.pattern.abstractfactory.chair

class PlasticChair:Chair {
    override fun create() {
        print("Create CHAIR by plastic")
    }
}