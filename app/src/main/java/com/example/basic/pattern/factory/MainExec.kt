package com.example.basic.pattern.factory

import com.example.basic.pattern.factory.impl.Bank

fun main() {
    var bank:Bank = BankFactory.getFactory(BankType.VIETTINBANK)
    bank.getBankName()
}