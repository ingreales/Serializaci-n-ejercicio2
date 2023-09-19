package HotelDTO;

import java.io.Serializable;

public class HotelDTO implements Serializable {
    public Integer Id;

    private String individual;

    private String dospersonas;

    private String cuatropersonas;


    private  String seispersonas;

    private String usuario;

    private String fumadores;

    public HotelDTO(Integer idp, String nom, String cat, double ca) {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getDospersonas() {
        return dospersonas;
    }

    public void setDospersonas(String dospersonas) {
        this.dospersonas = dospersonas;
    }

    public String getCuatropersonas() {
        return cuatropersonas;
    }

    public void setCuatropersonas(String cuatropersonas) {
        this.cuatropersonas = cuatropersonas;
    }

    public String getSeispersonas() {
        return seispersonas;
    }

    public void setSeispersonas(String seispersonas) {
        this.seispersonas = seispersonas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFumadores() {
        return fumadores;
    }

    public void setFumadores(String fumadores) {
        this.fumadores = fumadores;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "Id=" + Id +
                ", individual='" + individual + '\'' +
                ", dospersonas='" + dospersonas + '\'' +
                ", cuatropersonas='" + cuatropersonas + '\'' +
                ", seispersonas='" + seispersonas + '\'' +
                ", usuario='" + usuario + '\'' +
                ", fumadores='" + fumadores + '\'' +
                '}';
    }

    public HotelDTO(Integer id, String individual, String dospersonas, String cuatropersonas, String seispersonas, String usuario, String fumadores) {
        Id = id;
        this.individual = individual;
        this.dospersonas = dospersonas;
        this.cuatropersonas = cuatropersonas;
        this.seispersonas = seispersonas;
        this.usuario = usuario;
        this.fumadores = fumadores;


    }
}