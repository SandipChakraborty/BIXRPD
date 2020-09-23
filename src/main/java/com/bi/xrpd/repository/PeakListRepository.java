package com.bi.xrpd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bi.xrpd.entity.Peak;

@Repository
public interface PeakListRepository extends CrudRepository<Peak, Long> {

}
