package com.bi.xrpd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bi.xrpd.entity.SystemEntryAudit;

@Repository
public interface SystemEntryAuditRepository extends CrudRepository<SystemEntryAudit, Long> {

	
}
