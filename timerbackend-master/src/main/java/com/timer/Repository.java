package com.timer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, UUID> {
}
