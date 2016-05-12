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
@Table(name = "stimostpitan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stimostpitan.findAll", query = "SELECT s FROM Stimostpitan s"),
    @NamedQuery(name = "Stimostpitan.findById", query = "SELECT s FROM Stimostpitan s WHERE s.id = :id"),
    @NamedQuery(name = "Stimostpitan.findBySum", query = "SELECT s FROM Stimostpitan s WHERE s.sum = :sum")})
public class Stimostpitan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "sum")
    private long sum;
    @JoinColumn(name = "idtarif", referencedColumnName = "id")
    @ManyToOne
    private Tarifz idtarif;
    @JoinColumn(name = "idpitanie", referencedColumnName = "id")
    @ManyToOne
    private Pitanie idpitanie;

    public Stimostpitan() {
    }

    public Stimostpitan(Integer id) {
        this.id = id;
    }

    public Stimostpitan(Integer id, long sum) {
        this.id = id;
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public Tarifz getIdtarif() {
        return idtarif;
    }

    public void setIdtarif(Tarifz idtarif) {
        this.idtarif = idtarif;
    }

    public Pitanie getIdpitanie() {
        return idpitanie;
    }

    public void setIdpitanie(Pitanie idpitanie) {
        this.idpitanie = idpitanie;
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
        if (!(object instanceof Stimostpitan)) {
            return false;
        }
        Stimostpitan other = (Stimostpitan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.infiniteskills.mvc.entity.Stimostpitan[ id=" + id + " ]";
    }
    
}
