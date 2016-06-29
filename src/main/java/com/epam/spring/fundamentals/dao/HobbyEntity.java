package com.epam.spring.fundamentals.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hobby", schema = "", catalog = "")
public class HobbyEntity {
    private int id;
    private String hobbyId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hobby_id", nullable = false, length = 20)
    public String getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HobbyEntity that = (HobbyEntity) o;
        return id == that.id &&
                Objects.equals(hobbyId, that.hobbyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hobbyId);
    }
}
