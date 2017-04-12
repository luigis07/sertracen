/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LuisAlejandro
 */
@Entity
@Table(name = "esquela")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Esquela.findAll", query = "SELECT e FROM Esquela e"),
    @NamedQuery(name = "Esquela.findByIdesquela", query = "SELECT e FROM Esquela e WHERE e.idesquela = :idesquela"),
    @NamedQuery(name = "Esquela.findByDescripcion", query = "SELECT e FROM Esquela e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Esquela.findByMonto", query = "SELECT e FROM Esquela e WHERE e.monto = :monto"),
    @NamedQuery(name = "Esquela.findByAplica", query = "SELECT e FROM Esquela e WHERE e.aplica = :aplica")})
public class Esquela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idesquela")
    private Integer idesquela;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;
    @Size(max = 20)
    @Column(name = "aplica")
    private String aplica;
    @JoinColumn(name = "idvehiculo", referencedColumnName = "idvehiculo")
    @ManyToOne
    private Vehiculo idvehiculo;

    public Esquela() {
    }

    public Esquela(Integer idesquela) {
        this.idesquela = idesquela;
    }

    public Integer getIdesquela() {
        return idesquela;
    }

    public void setIdesquela(Integer idesquela) {
        this.idesquela = idesquela;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public Vehiculo getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(Vehiculo idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idesquela != null ? idesquela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Esquela)) {
            return false;
        }
        Esquela other = (Esquela) object;
        if ((this.idesquela == null && other.idesquela != null) || (this.idesquela != null && !this.idesquela.equals(other.idesquela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Esquela[ idesquela=" + idesquela + " ]";
    }
    
}
