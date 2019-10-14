package com.gzy.im.repository;

import com.gzy.im.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 操作数据库的
// 两个泛型
//  <T, ID>
// T  操作那种实体   操作的是User
// ID id 字段的类型  Long
public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByName(String name);

}
