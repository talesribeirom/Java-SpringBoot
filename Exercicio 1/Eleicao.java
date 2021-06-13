import java.util.*;

public class Eleicao{
    
    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    //Construtor da classe
    public Eleicao(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos){
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }
    //Getters
    
    public double getVotosValidos(){
        return (this.votosValidos*100)/this.totalEleitores;
    }

    public double getVotosBrancos(){
        return (this.votosBrancos*100)/this.totalEleitores;
    }

    public double getVotosNulos(){
        return (this.votosNulos*100)/this.totalEleitores;
    }

}