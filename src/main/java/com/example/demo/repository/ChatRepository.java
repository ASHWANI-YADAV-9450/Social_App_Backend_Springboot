package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Chat;
import com.example.demo.models.User;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
    
    @Query("SELECT c FROM Chat c JOIN c.users u WHERE u.id = :userId")
    public List<Chat> findByUserId(@Param("userId") Integer userId);
	
//	public List<Chat> findByUserId(Integer userId);
	
	@Query("select c from Chat c Where :user Member of c.users And :reqUser Member of c.users")
	public Chat findChatByUsersId(@Param("user") User user, @Param("reqUser") User reqUser);
}











//package com.example.demo.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.example.demo.models.Chat;
//
//public interface ChatRepository extends JpaRepository<Chat, Integer> {
//	
//	@Query("SELECT c FROM Chat c WHERE c.userId = :userId")
//	public List<Chat> findByUserId(@Param("userId") Integer userId);
//
////	public List<Chat> findByUserId(Integer userId);
//
//}
 