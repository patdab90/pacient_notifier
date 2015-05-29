package my.study.siwoz.pncore.dao;

import java.io.Serializable;

import my.study.siwoz.pncore.entity.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long>,
		Serializable {

}
