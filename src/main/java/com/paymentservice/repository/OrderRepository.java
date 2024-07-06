package com.paymentservice.repository;


import com.paymentservice.entity.Order;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface OrderRepository extends JpaRepository<Order, Long> {



     List<Order> findAll();



    List<Order> findAll(Sort sort);



     Page<Order> findAll(Pageable pageable);



   List<Order> findAllById(Iterable<Long> longs);



    long count();



     void deleteById(Long aLong);



  void delete(Order entity);


    void deleteAllById(Iterable<? extends Long> longs);




     void deleteAll(Iterable<? extends Order> entities);




     void deleteAll() ;




    <S extends Order> S save(S entity);




   <S extends Order> List<S> saveAll(Iterable<S> entities);




     Optional<Order> findById(Long aLong);




    boolean existsById(Long aLong);




    void flush() ;



  <S extends Order> S saveAndFlush(S entity) ;




    <S extends Order> List<S> saveAllAndFlush(Iterable<S> entities);




     void deleteAllInBatch(Iterable<Order> entities) ;




     void deleteAllByIdInBatch(Iterable<Long> longs);



 void deleteAllInBatch() ;


    Order getOne(Long aLong);


   Order getById(Long aLong);


    Order getReferenceById(Long aLong);



     <S extends Order> Optional<S> findOne(Example<S> example) ;



   <S extends Order> List<S> findAll(Example<S> example) ;



   <S extends Order> List<S> findAll(Example<S> example, Sort sort) ;


     <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable);



   <S extends Order> long count(Example<S> example);


     <S extends Order> boolean exists(Example<S> example);



   <S extends Order, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

}
