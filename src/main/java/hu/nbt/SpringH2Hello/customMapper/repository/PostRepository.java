package hu.nbt.SpringH2Hello.customMapper.repository;

import hu.nbt.SpringH2Hello.customMapper.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("customPostRepository")
public interface PostRepository extends JpaRepository<Post, Long> {
}

