package com.pbl.filesharing.FileSharing.entity;

import javax.persistence.*;
import javax.print.Doc;
import java.util.Date;

/**
 * @author Beatrice V.
 * @created 22.11.2020 - 22:16
 * @project FileSharing
 */
@Entity
@Table(name="documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512, nullable = false, unique = true)
    private String name;

    @Column(length = 512, nullable = false)
    private String owner;

    private long size;

    @Column(name = "upload_time")
    private Date uploadTime;

    @Lob
    @Column(columnDefinition="BLOB")
    private byte[] content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Document(){ }

    public Document(Long id, String name, long size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
