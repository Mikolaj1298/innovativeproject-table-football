package com.tablefootbal.server.repository;

import com.tablefootbal.server.entity.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SensorRepository extends CrudRepository<Sensor, String>
{
}
