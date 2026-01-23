package hu.nbt.SpringH2Hello.customMapper.repository;

import hu.nbt.SpringH2Hello.customMapper.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("customUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
