/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Соколов
 */
@Entity
@Table(name = "rabota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rabota.findAll", query = "SELECT r FROM Rabota r"),
    @NamedQuery(name = "Rabota.findById", query = "SELECT r FROM Rabota r WHERE r.id = :id"),
    @NamedQuery(name = "Rabota.findByName", query = "SELECT r FROM Rabota r WHERE r.name = :name")})
public class Rabota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name = "idremont", referencedColumnName = "id")
    @ManyToOne
    private Remont idremont;

    public Rabota() {
    }

    public Rabota(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Remont getIdremont() {
        return idremont;
    }

    public void setIdremont(Remont idremont) {
        this.idremont = idremont;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rabota)) {
            return false;
        }
        Rabota other = (Rabota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.infiniteskills.mvc.entity.Rabota[ id=" + id + " ]";
    }
    
}
