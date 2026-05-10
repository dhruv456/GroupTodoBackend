package com.dvj.groupTodoBackend.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class UserGroupId implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "group_id") 
    private Long groupId;

    // equals and hashCode methods should be implemented for composite key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserGroupId that)) return false;
        return Objects.equals(userId, that.userId)
            && Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, groupId);
    }
    
}
