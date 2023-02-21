package com.test.lotto.repository

import com.test.lotto.entity.Lotto
import org.springframework.data.jpa.repository.JpaRepository

interface LottoRepository:JpaRepository<Lotto,Long> {
}