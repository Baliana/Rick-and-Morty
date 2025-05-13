package br.senai.sp.jandira.rickandmorty.model

import javax.net.ssl.SSLEngineResult.Status

data class Character(
    var id: Int = 8,
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var image: String = ""
)
