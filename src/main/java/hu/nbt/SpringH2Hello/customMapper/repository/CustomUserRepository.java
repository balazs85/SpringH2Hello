package hu.nbt.SpringH2Hello.customMapper.repository;

import hu.nbt.SpringH2Hello.customMapper.entity.CustomUser;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomUserRepository extends JpaRepository<CustomUser, Long> {
}
