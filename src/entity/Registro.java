/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
/**
 *
 * @author José
 */

public class Registro {
    private String codigo;
    private String curso;
    private String horas;
    private String creditos;
    private String fechain;
    private String fechafin;

    public Registro() {
    }

    public Registro(String codigo, String curso, String horas, String creditos, String fechain, String fechafin) {
        this.codigo = codigo;
        this.curso = curso;
        this.horas = horas;
        this.creditos = creditos;
        this.fechain = fechain;
        this.fechafin = fechafin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getFechain() {
        return fechain;
    }

    public void setFechain(String fechain) {
        this.fechain = fechain;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

   
}
