package Principal;

public class Principal {


    public static void main(String[] args) {
        
        Personagem p[] = new Personagem[4];
        p[0] = new Personagem("Jikany", "Elfo", "Assassino", 10, 14, 20, 5);
        p[1] = new Personagem("Eretha", "Humano", "Mago", 14, 20, 10, 5);
        p[2] = new Personagem("Kallash", "Elfo Escuro", "Druida", 14, 16, 14, 5);
        p[3] = new Personagem ("Max", "Gnomo", "Necromante", 20, 14,  10, 5);
        
        Batalha x1 = new Batalha();
        x1.marcarBatalha(p[2], p[3]);
        x1.batalhar();
        
    }
    
}
