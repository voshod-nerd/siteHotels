/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "SOTRUDNIK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sotrudnik.findAll", query = "SELECT s FROM Sotrudnik s"),
    @NamedQuery(name = "Sotrudnik.findById", query = "SELECT s FROM Sotrudnik s WHERE s.id = :id"),
    @NamedQuery(name = "Sotrudnik.findByDr", query = "SELECT s FROM Sotrudnik s WHERE s.dr = :dr"),
    @NamedQuery(name = "Sotrudnik.findByFio", query = "SELECT s FROM Sotrudnik s WHERE s.fio = :fio"),
    @NamedQuery(name = "Sotrudnik.findByGrag", query = "SELECT s FROM Sotrudnik s WHERE s.grag = :grag"),
    @NamedQuery(name = "Sotrudnik.findByNum", query = "SELECT s FROM Sotrudnik s WHERE s.num = :num"),
    @NamedQuery(name = "Sotrudnik.findBySer", query = "SELECT s FROM Sotrudnik s WHERE s.ser = :ser")})
public class Sotrudnik implements Serializable {
    
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    @JsonProperty(ID_PROPERTY)
    private Integer id;
    @Column(name = "DR")
    @Temporal(TemporalType.DATE)
    private Date dr;
    @Column(name = "FIO")
    private String fio;
    @Column(name = "GRAG")
    private String grag;
    @Column(name = "NUM")
    private String num;
    @Column(name = "SER")
    private String ser;
    @OneToMany(mappedBy = "idsotr")
    @JsonIgnore
    private Collection<Zayvka> zayvkaCollection;
    @JoinColumn(name = "IDDOLGNOST", referencedColumnName = "ID")
    @ManyToOne
    private Dolgnost iddolgnost;
    @JoinColumn(name = "iduser", referencedColumnName = "id")
    @ManyToOne
    private User iduser;

    public Sotrudnik() {
    }

    public Sotrudnik(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDr() {
        return dr;
    }

    public void setDr(Date dr) {
        this.dr = dr;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGrag() {
        return grag;
    }

    public void setGrag(String grag) {
        this.grag = grag;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    @XmlTransient
    public Collection<Zayvka> getZayvkaCollection() {
        return zayvkaCollection;
    }

    public void setZayvkaCollection(Collection<Zayvka> zayvkaCollection) {
        this.zayvkaCollection = zayvkaCollection;
    }

    public Dolgnost getIddolgnost() {
        return iddolgnost;
    }

    public void setIddolgnost(Dolgnost iddolgnost) {
        this.iddolgnost = iddolgnost;
    }

    public User getIduser() {
        return iduser;
    }

    public void setIduser(User iduser) {
        this.iduser = iduser;
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
        if (!(object instanceof Sotrudnik)) {
            return false;
        }
        Sotrudnik other = (Sotrudnik) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.infiniteskills.mvc.entity.Sotrudnik[ id=" + id + " ]";
    }
    
}
