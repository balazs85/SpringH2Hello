package hu.nbt.SpringH2Hello.customMapper.repository;

import hu.nbt.SpringH2Hello.customMapper.entity.CustomPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomPostRepository extends JpaRepository<CustomPost, Long> {
}

