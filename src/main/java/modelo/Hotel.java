package modelo;

public class Hotel {

    private int hotelId;
    private String nome;
    private String cidade;
    private int quartos;
    private double valorDiaria;
    private int estrelas;

    public Hotel() {
        this(-1, "", "", 0, 0, 0);
    }

    public Hotel(int hotelId, String nome, String cidade, int quartos, double valorDiaria, int estrelas) {
        setHotelId(hotelId);
        setNome(nome);
        setCidade(cidade);
        setQuartos(quartos);
        setValorDiaria(valorDiaria);
        setEstrelas(estrelas);
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

}
