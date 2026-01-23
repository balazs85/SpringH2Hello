package hu.nbt.SpringH2Hello.repository;

import hu.nbt.SpringH2Hello.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

