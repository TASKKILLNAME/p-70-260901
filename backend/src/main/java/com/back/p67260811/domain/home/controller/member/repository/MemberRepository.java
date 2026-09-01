package com.back.p67260811.domain.home.controller.member.repository;

import com.back.p67260811.domain.home.controller.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
