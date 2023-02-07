package com.sarvabanking;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Account, Integer> {

}
