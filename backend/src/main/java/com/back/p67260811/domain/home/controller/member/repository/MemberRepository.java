package com.back.p67260811.domain.home.controller.member.repository;

import com.back.p67260811.domain.home.controller.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
