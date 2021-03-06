package com.bi.xrpd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bi.xrpd.entity.DiffractionPattern;

@Repository
public interface DiffractionPatternRepository extends CrudRepository<DiffractionPattern, Long> {

}
