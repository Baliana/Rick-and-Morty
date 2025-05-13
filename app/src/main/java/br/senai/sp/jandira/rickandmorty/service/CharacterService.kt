package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.Character
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CharacterService {

    // Faz uma requisição GET para o endpoint "character" retorna todos os personagens disponíveis na API
    @GET("character")
    fun listAllCharacters(): Call<Result>

    // Retorna os dados de um personagem específico pelo id
    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Int): Call<Character>


    @POST("character")
    fun insert(@Body  character: Character): Call<Character>
}