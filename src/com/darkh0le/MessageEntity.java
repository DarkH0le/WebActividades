package com.darkh0le;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author $darkh0le
 */
@Entity
@Table(name = "Message", schema = "MessageRepo", catalog = "")
public class MessageEntity {
    private short id;
    private String message;

    @Id
    @Column(name = "id")
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return id == that.id &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
