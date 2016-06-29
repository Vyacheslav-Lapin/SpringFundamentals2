package com.epam.spring.fundamentals.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "", catalog = "")
public class CountryEntity {
    private int id;
    private String name;
    private String codeName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code_name", nullable = true, length = 255)
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(codeName, that.codeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, codeName);
    }
}
