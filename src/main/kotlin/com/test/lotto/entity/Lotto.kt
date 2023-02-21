package com.test.lotto.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Lotto(
        lottoNo: String,
        member: Member
) {
    @Id
    @GeneratedValue
    var lottoId: Long? = null
    var lottoNo: String = lottoNo
    var createdDate: LocalDateTime? = null

    var option:String?=null

    @ManyToOne
    @JoinColumn(name = "memberId")
    var member: Member = member
}