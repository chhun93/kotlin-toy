package com.test.lotto.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lotto")
class LottoController {

    @GetMapping("/random")
    fun getSixRandomNumbers(){

    }
    @PostMapping("/random")
    fun getRandomNUmbersInOptions(){

    }
}