package Principal;

public class Personagem {
    // atributos
    private String nome;
    private String raca;
    private String classe;
    private int constituicao;
    private int inteligencia;
    private int destreza;
    private int resistencia;
    
    
    public Personagem(String nome, String raca, String classe, int constituicao, int inteligencia, int destreza, int resistencia)
    {
       this.nome = nome;
       this.raca = raca;
       this.classe = classe;
       this.constituicao = constituicao;
       this.inteligencia = inteligencia;
       this.destreza = destreza;
       this.resistencia = resistencia;
    }
    public void status()
    {
        System.out.println("\n================== STATUS ==================");
        System.out.println(this.getNome() + " e da raca " + this.getRaca() + " e possui a classe " + this.getClasse());
        System.out.println("============================================\n");
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getRaca()
    {
        return raca;
    }
    public void setRaca(String raca)
    {
        this.raca = raca;
    }
    public String getClasse()
    {
        return classe;
    }
    public void setClasse(String classe)
    {
        this.classe = classe;
    }
    public int getConstituicao()
    {
        return constituicao;
    }
    public void setConstituicao(int constituicao)
    {
        this.constituicao = constituicao;
    }
    public int getInteligencia()
    {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia)
    {
        this.inteligencia = inteligencia;
    }
    public int getDestreza()
    {
        return destreza;
    }
    public void setDestreza(int destreza)
    {
        this.destreza = destreza;
    }
    public int getResistencia()
    {
        return resistencia;
    }
    public void setResistencia(int resistencia)
    {
        this.resistencia = resistencia;
    }
}
