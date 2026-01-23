package hu.nbt.SpringH2Hello.mapstruct.repository;

import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MapstructUserRepository extends JpaRepository<MapstructUser, Long> {
}
