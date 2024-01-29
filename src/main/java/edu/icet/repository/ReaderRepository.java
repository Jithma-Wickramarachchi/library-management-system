package edu.icet.repository;

import edu.icet.entity.ReaderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReaderRepository extends CrudRepository<ReaderEntity, String> {
}
