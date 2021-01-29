package com.example.basic.pattern.singleton

class LoggerSingleton {
    private fun LoggerSingleton() {}

    companion object {
        private fun getIntance(): LoggerSingleton {
            return SingletonHelper.INSTANCE
        }
        private class SingletonHelper {
            companion object {
                final var INSTANCE: LoggerSingleton = LoggerSingleton()
            }
        }
    }
}