package hu.nbt.SpringH2Hello.mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.nbt.SpringH2Hello.mapstruct.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("mapstructUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
