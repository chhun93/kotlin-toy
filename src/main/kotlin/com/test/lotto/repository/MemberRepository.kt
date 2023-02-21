package com.test.lotto.repository

import com.test.lotto.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository:JpaRepository<Member,Long> {
}