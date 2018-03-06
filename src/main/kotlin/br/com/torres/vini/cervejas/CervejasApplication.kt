package br.com.torres.vini.cervejas

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CervejasApplication

fun main(args: Array<String>) {
    runApplication<CervejasApplication>(*args)
}