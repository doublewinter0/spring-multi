package ren.erdong.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import ren.erdong.domain.City;

import java.util.List;

@Repository
public interface CityRepository extends ElasticsearchRepository<City, Long> {

	List<City> findByCityname(String cityName);
}
