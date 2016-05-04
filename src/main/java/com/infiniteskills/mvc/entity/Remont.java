/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Соколов
 */
@Entity
@Table(name = "remont")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Remont.findAll", query = "SELECT r FROM Remont r"),
    @NamedQuery(name = "Remont.findById", query = "SELECT r FROM Remont r WHERE r.id = :id"),
    @NamedQuery(name = "Remont.findByDateb", query = "SELECT r FROM Remont r WHERE r.dateb = :dateb"),
    @NamedQuery(name = "Remont.findByDateend", query = "SELECT r FROM Remont r WHERE r.dateend = :dateend"),
    @NamedQuery(name = "Remont.findByDescription", query = "SELECT r FROM Remont r WHERE r.description = :description"),
    @NamedQuery(name = "Remont.findByTyperemont", query = "SELECT r FROM Remont r WHERE r.typeremont = :typeremont")})
public class Remont implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dateb")
    @Temporal(TemporalType.DATE)
    private Date dateb;
    @Column(name = "dateend")
    @Temporal(TemporalType.DATE)
    private Date dateend;
    @Column(name = "description")
    private String description;
    @Column(name = "typeremont")
    private String typeremont;
    @JoinColumn(name = "idhotel", referencedColumnName = "ID")
    @ManyToOne
    private Hotel idhotel;
    @OneToMany(mappedBy = "idremont")
    @JsonIgnore
    private Collection<Rabota> rabotaCollection;

    public Remont() {
    }

    public Remont(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateb() {
        return dateb;
    }

    public void setDateb(Date dateb) {
        this.dateb = dateb;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTyperemont() {
        return typeremont;
    }

    public void setTyperemont(String typeremont) {
        this.typeremont = typeremont;
    }

    public Hotel getIdhotel() {
        return idhotel;
    }

    public void setIdhotel(Hotel idhotel) {
        this.idhotel = idhotel;
    }

    @XmlTransient
    public Collection<Rabota> getRabotaCollection() {
        return rabotaCollection;
    }

    public void setRabotaCollection(Collection<Rabota> rabotaCollection) {
        this.rabotaCollection = rabotaCollection;
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
        if (!(object instanceof Remont)) {
            return false;
        }
        Remont other = (Remont) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.infiniteskills.mvc.entity.Remont[ id=" + id + " ]";
    }
    
}
