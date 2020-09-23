package com.bi.xrpd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bi.xrpd.entity.SystemEntry;;

@Repository
public interface SystemEntryRepository extends CrudRepository<SystemEntry, Long> {

}
