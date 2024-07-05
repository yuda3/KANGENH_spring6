package com.kangenh_spring6.repository;

import com.kangenh_spring6.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
