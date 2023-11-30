package com.octo.masterclass.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository extends CrudRepository<Plat, Long> {}
