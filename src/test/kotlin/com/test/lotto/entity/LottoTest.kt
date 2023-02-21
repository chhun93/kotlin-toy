package com.test.lotto.entity

import com.test.lotto.repository.LottoRepository
import com.test.lotto.repository.MemberRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LottoTest(
        @Autowired
        val lottoRepository: LottoRepository,
        @Autowired
        val memberRepository: MemberRepository
) {
    @Test
    fun given_lotto_info_when_insert_lotto_data_then_saved_lotto_in_db() {
        //given
        val member = Member("test1")
        val lotto = Lotto("1,2,3,4,5,6", member)
        //when
        val savedMember = memberRepository.save(member)
        val savedLotto = lottoRepository.save(lotto)
        //then
        Assertions.assertEquals("test1", savedLotto.member.name)
    }
}