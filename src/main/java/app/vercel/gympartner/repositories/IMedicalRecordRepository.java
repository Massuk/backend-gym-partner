package app.vercel.gympartner.repositories;

import app.vercel.gympartner.entities.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
}
