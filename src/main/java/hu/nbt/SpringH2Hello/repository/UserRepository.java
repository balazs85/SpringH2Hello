package hu.nbt.SpringH2Hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hu.nbt.SpringH2Hello.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
