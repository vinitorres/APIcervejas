package br.com.torres.vini.cervejas.controller

import br.com.torres.vini.cervejas.model.Cerveja
import br.com.torres.vini.cervejas.service.CervejaServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = ["/cerveja"])
class CervejaController {

    @Autowired
    lateinit var cervejaService: CervejaServices

    @GetMapping
    fun buscarTodos(): List<Cerveja> {
        return cervejaService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody cerveja: Cerveja) {
        cervejaService.salvar(cerveja)
    }
//
//    @PostMapping
//    fun excluir(@RequestBody cerveja: Cerveja) {
//        cervejaService.excluir(cerveja)
//    }
}