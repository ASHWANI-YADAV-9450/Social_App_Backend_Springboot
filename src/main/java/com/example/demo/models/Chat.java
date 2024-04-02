package com.example.demo.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Chat {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType .AUTO)
//	private Integer id;
//	
//	private String chat_name;
//	
//	private String chat_image;
//	
//	@ManyToMany
//	private List<User> users= new ArrayList<>();
//	
//	private LocalDateTime timestamp;
//	
//	
//	@OneToMany(mappedBy = "chat")
//	private List<Message> messages = new ArrayList<>();
//
//}
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String chatName;
    
    private String chatImage;
    
    @ManyToMany
    private List<User> users = new ArrayList<>();
    
    private LocalDateTime timestamp;
    
    @OneToMany(mappedBy = "chat")
//    @JsonIgnore
    private List<Message> messages = new ArrayList<>();

    // Constructor
    public Chat() {
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getChatImage() {
        return chatImage;
    }

    public void setChatImage(String chatImage) {
        this.chatImage = chatImage;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
