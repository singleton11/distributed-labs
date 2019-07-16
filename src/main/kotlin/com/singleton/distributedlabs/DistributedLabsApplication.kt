package com.singleton.distributedlabs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DistributedLabsApplication

fun main(args: Array<String>) {
    runApplication<DistributedLabsApplication>(*args)
}
