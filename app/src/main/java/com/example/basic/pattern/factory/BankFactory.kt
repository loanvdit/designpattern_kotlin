package com.example.basic.pattern.factory

import com.example.basic.pattern.factory.impl.*

class BankFactory {
    companion object {
        fun getFactory(instance: BankType): Bank {
            when(instance) {
                BankType.TPBANK -> {
                    return TPBank()
                }
                BankType.VIETCOMBANK -> {
                    return VCBank()
                }
                BankType.VIETTINBANK -> {
                    return VietTinBank()
                }
                BankType.VPBANK -> {
                    return VPBank()
                }
            }
        }
    }
}