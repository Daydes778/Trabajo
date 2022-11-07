/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import entity.Registro;
/**
 *
 * @author José
 */
public class RegistroDao {
    private List<Registro> lista;
    
    public RegistroDao(){
        lista = new ArrayList<>();
    }
    
    public void add(Registro regi){
        lista.add(regi);
    }

    public List<Registro> getLista() {
        return lista;
    }
    
    public void actualizar(int index, Registro regi){
        lista.get(index).setCodigo(regi.getCodigo());
        lista.get(index).setCurso(regi.getCurso());
        lista.get(index).setHoras(regi.getHoras());
        lista.get(index).setCreditos(regi.getCreditos());
        lista.get(index).setFechain(regi.getFechain());
        lista.get(index).setFechafin(regi.getFechafin());
    }
    
    public void eliminar(int index){
        lista.remove(index);
    }
    
    public int search(String codigo){
        int index=-1;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigo().equals(codigo))
                index=i;
        }
        return index;
    }    
}
