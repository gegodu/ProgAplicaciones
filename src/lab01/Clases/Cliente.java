/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author gera
 */
public class Cliente extends Usuario{
    private String apellido;
    private String fNac;
    private Map pedidos;
   
    //public Cliente(){}
    public Cliente(String nickname, String nombre, String email, String direccion,String apellido, String img, String fecha) {
        super(nickname,nombre,email,direccion);
       //setNickname(); poner los valores de los tb
        this.apellido = apellido;
        this.imagen = img;
        this.fNac = fecha;
    }

    public Cliente(String nickname, String nombre, String email, String direccion, String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellido() {
        return apellido;
    }
    public String getImagen(){
        return imagen;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setImagen(String img){
        this.imagen = img;
    }
    
    public String getFecha(){
        return fNac;
    }

    public void setFecha(String fecha) {
        this.fNac = fecha;
    }
    public String getMail(){
        return mail;
    }
    public String getNickname() {
        return nickname;
    }
    
    public Map getPedidos(){
        return this.pedidos;
    }
    
    public Pedido getPedido(double id) throws Exception{
        Iterator it = this.getPedidos().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry peds = (Map.Entry) it.next();
            Pedido p = (Pedido)peds.getValue();
            if(p.getId() == id){
                return p;
            }
        }
        throw new Exception("No existe el pedido...");
    }
    
    public void setPedido(Pedido p){
        this.pedidos.put(p.getId(), p);
    }
    
    public void setPedidos(Map pedidos){
        this.pedidos = pedidos;
    }
    
    public DataCliente ClienteADC(){
        DataCliente DC = new DataCliente(this.nickname, this.nombre, this.mail, this.direccion, this.apellido, this.imagen, this.fNac);
        return DC;
    }
    
    public void actualizarEstadoPedido(double id, estados estado) throws Exception{
        this.getPedido(id).setEstado(estado);
    }
}
