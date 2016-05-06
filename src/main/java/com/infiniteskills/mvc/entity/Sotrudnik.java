/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author �������
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
    @NamedQuery(name = "Sotrudnik.findBySer", query = "SELECT s FROM Sotrudnik s WHERE s.ser = :ser"),
    @NamedQuery(name = "Sotrudnik.findByMr", query = "SELECT s FROM Sotrudnik s WHERE s.mr = :mr"),
    @NamedQuery(name = "Sotrudnik.findByDoclich", query = "SELECT s FROM Sotrudnik s WHERE s.doclich = :doclich"),
    @NamedQuery(name = "Sotrudnik.findByKemvidan", query = "SELECT s FROM Sotrudnik s WHERE s.kemvidan = :kemvidan"),
    @NamedQuery(name = "Sotrudnik.findByAdres", query = "SELECT s FROM Sotrudnik s WHERE s.adres = :adres"),
    @NamedQuery(name = "Sotrudnik.findByPhone", query = "SELECT s FROM Sotrudnik s WHERE s.phone = :phone"),
    @NamedQuery(name = "Sotrudnik.findByEducation", query = "SELECT s FROM Sotrudnik s WHERE s.education = :education"),
    @NamedQuery(name = "Sotrudnik.findByKoldet", query = "SELECT s FROM Sotrudnik s WHERE s.koldet = :koldet"),
    @NamedQuery(name = "Sotrudnik.findByKogdavidan", query = "SELECT s FROM Sotrudnik s WHERE s.kogdavidan = :kogdavidan")})
public class Sotrudnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
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
    @Basic(optional = false)
    @Column(name = "MR")
    private String mr;
    @Basic(optional = false)
    @Column(name = "DOCLICH")
    private String doclich;
    @Basic(optional = false)
    @Column(name = "KEMVIDAN")
    private String kemvidan;
    @Basic(optional = false)
    @Column(name = "ADRES")
    private String adres;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @Column(name = "EDUCATION")
    private String education;
    @Basic(optional = false)
    @Column(name = "KOLDET")
    private int koldet;
    @Basic(optional = false)
    @Column(name = "KOGDAVIDAN")
    @Temporal(TemporalType.DATE)
    private Date kogdavidan;
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

    public Sotrudnik(Integer id, String mr, String doclich, String kemvidan, String adres, String phone, String education, int koldet, Date kogdavidan) {
        this.id = id;
        this.mr = mr;
        this.doclich = doclich;
        this.kemvidan = kemvidan;
        this.adres = adres;
        this.phone = phone;
        this.education = education;
        this.koldet = koldet;
        this.kogdavidan = kogdavidan;
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

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getDoclich() {
        return doclich;
    }

    public void setDoclich(String doclich) {
        this.doclich = doclich;
    }

    public String getKemvidan() {
        return kemvidan;
    }

    public void setKemvidan(String kemvidan) {
        this.kemvidan = kemvidan;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getKoldet() {
        return koldet;
    }

    public void setKoldet(int koldet) {
        this.koldet = koldet;
    }

    public Date getKogdavidan() {
        return kogdavidan;
    }

    public void setKogdavidan(Date kogdavidan) {
        this.kogdavidan = kogdavidan;
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
