public class ResultadoEleicao {
    public static void main(String[] args){

        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);
        
        System.out.println("Votos Validos " + eleicao.getVotosValidos() + " %"); 
        System.out.println("Votos Brancos " + eleicao.getVotosBrancos() + " %");
        System.out.println("Votos Nulos " + eleicao.getVotosNulos() + " %");
    }
}
