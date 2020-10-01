package com.herokuapp.openapi.repository;

import com.herokuapp.openapi.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Integer> {
}