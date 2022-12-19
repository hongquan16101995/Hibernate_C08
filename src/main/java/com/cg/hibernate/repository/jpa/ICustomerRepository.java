package com.cg.hibernate.repository.jpa;

import com.cg.hibernate.model.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//@Component
@Repository
@Transactional
public interface ICustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findAllByNameContaining(String name);

    List<Customer> findAllByAddressContaining(String address);

    //lưu ý khi viết native trong JPA: tên phương thức native không được trùng với các phương thức có sẵn của JPA
    //@Query: dùng để chứa câu lệnh native query
    //@Param: dùng để thêm tham số vào câu lệnh truy vấn native query

    //ví dụ: lấy ra danh sách của Customer có tên và địa chỉ gần đúng
    @Query(value = "select * from customer " +
            "where name like :name or address like :address",
            nativeQuery = true)
    List<Customer> demoQueryNative(@Param("name") @Nullable String name,
                                   @Param("address") @Nullable String address);

    //annotation @Modifying: cho phép sử dụng các câu truy vấn UPDATE/CREATE/DELETE trong dữ liệu
    @Modifying
    @Query(value = "update customer " +
            "set name = 'demo' where address = :address;",
            nativeQuery = true)
    void demoQueryNative1(@Param("address") @Nullable String address);

    @Modifying
    @Query(value = "update customer set name = 'abc' where id = 10;" +
            "delete from customer where id = 100;", nativeQuery = true)
    void demoQueryNative2();
}
