public class MinhaClasse{
    public static void main (String[]args){
        String nome="Jurineide";
        String sobreNome= "Souza";
        String nomeCompleto= nomeCompleto(nome,sobreNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto( String nome, String sobreNome){
        return "Esse é um método de retorno " + nome.concat(" de ").concat(sobreNome);

    }
}