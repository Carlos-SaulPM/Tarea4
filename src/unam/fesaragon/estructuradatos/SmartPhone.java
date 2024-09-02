package unam.fesaragon.estructuradatos;

public class SmartPhone {
    private int modelo;
    private String marca;
    private int versionDeModelo;
    private String sistemaOperativo;

    public SmartPhone(int modelo, String marca, int versionDeModelo, String sistemaOperativo) {
        this.modelo = modelo;
        this.marca = marca;
        this.versionDeModelo = versionDeModelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return STR."\{this.marca} \{this.versionDeModelo} \{this.modelo}";

    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVersionDeModelo() {
        return versionDeModelo;
    }

    public void setVersionDeModelo(int versionDeModelo) {
        this.versionDeModelo = versionDeModelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
