package com.stackroute.MuzixAppMysql.repository;

import com.stackroute.MuzixAppMysql.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//repository annotation is used to identify that this is a repository
@Repository
//repository extends mongorepository because of mongodb usage
public interface TrackRepository extends MongoRepository<Track,Integer> {

  //    @Query("SELECT t FROM Track t WHERE name = ?1")
//    List<Track> getTrackByName(String name);
//
//    //@Query(value = "SELECT t FROM Track t WHERE (?1 is null OR name = ?1) AND (?2 = 0 OR id = ?2)")
//    @Query(value = "SELECT t FROM Track t WHERE name = ?1 OR artist = ?1")
//    List<Track> searchTracks(String searchString);
}
