package hu.nbt.SpringH2Hello.mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.nbt.SpringH2Hello.mapstruct.entity.Post;
import org.springframework.stereotype.Repository;

@Repository("mapstructPostRepository")
public interface PostRepository extends JpaRepository<Post, Long> {
}

