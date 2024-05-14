
public class Votos {
    private String partido;
    private int votos;

    public Votos(String partido, int votos) {
        this.partido = partido;
        this.votos = votos;
    }

    public String getPartido() {
        return this.partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return this.votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "{" +
            " partido='" + getPartido() + "'" +
            ", votos='" + getVotos() + "'" +
            "}";
    }

}
