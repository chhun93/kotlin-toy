package com.test.lotto.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member(
        name: String
) {
    @Id
    @GeneratedValue
    var memberId: Long? = null
    var name: String = name
}