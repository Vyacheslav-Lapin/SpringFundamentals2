package com.epam.spring.fundamentals.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact_hobby_detail", schema = "", catalog = "")
public class ContactHobbyDetailEntity {
    private int id;
    private int contactId;
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
    @Column(name = "contact_id", nullable = false)
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
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
        ContactHobbyDetailEntity that = (ContactHobbyDetailEntity) o;
        return id == that.id &&
                contactId == that.contactId &&
                Objects.equals(hobbyId, that.hobbyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactId, hobbyId);
    }
}
