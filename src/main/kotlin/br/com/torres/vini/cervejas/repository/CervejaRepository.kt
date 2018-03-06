package br.com.torres.vini.cervejas.repository

import br.com.torres.vini.cervejas.model.Cerveja
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CervejaRepository: MongoRepository<Cerveja, String>