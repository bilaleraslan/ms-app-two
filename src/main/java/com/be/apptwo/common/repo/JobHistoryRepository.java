package com.be.apptwo.common.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.be.apptwo.common.model.JobHistory;
import com.be.apptwo.common.model.JobHistoryPK;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryPK> {

}
