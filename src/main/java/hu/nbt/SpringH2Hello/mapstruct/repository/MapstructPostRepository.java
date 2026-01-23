package hu.nbt.SpringH2Hello.mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.nbt.SpringH2Hello.mapstruct.entity.MapstructPost;
import org.springframework.stereotype.Repository;

@Repository
public interface MapstructPostRepository extends JpaRepository<MapstructPost, Long> {
}

