package br.com.torres.vini.cervejas.service

import br.com.torres.vini.cervejas.model.Cerveja
import br.com.torres.vini.cervejas.repository.CervejaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CervejaServices {

    @Autowired
    lateinit var cervejaRepository: CervejaRepository

    fun buscarTodos() : List<Cerveja>{
        return cervejaRepository.findAll()
    }

    fun salvar(cerveja: Cerveja) {
        cervejaRepository.save(cerveja)
    }

    fun excluir(cerveja: Cerveja) {
        cervejaRepository.delete(cerveja)
    }

}