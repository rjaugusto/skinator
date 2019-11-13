package com.rafael.skinator.skin.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.skinator.skin.domain.Skin;

@Repository
public interface SkinRepository extends JpaRepository<Skin, Integer> {

}
