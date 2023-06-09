package vn.iotstar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.iotstar.entity.Call;

@Repository
public interface CallRepository extends JpaRepository<Call, Integer>{

}
