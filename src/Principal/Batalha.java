package Principal;

import java.util.Random;

public class Batalha {
    private Personagem desafiado;
    private Personagem desafiante;
    private boolean aprovada;
    
    public void marcarBatalha(Personagem p1, Personagem p2)
    {
        if (!p1.getNome().equals(p2.getNome()))
        {
            this.setDesafiado(p1);
            this.setDesafiante(p2);
            this.setAprovada(true);
        }
        else
        {
            this.setDesafiado(null);
            this.setDesafiante(null);
            this.setAprovada(false);
        }
    }
    
    public void batalhar()
    {
        if (this.getAprovada() == true)
        {
            
            // atributos desafiado
            int pvDesafiado = (this.getDesafiado().getConstituicao() * 4);
            int poderDesafiado = (this.getDesafiado().getInteligencia() / 2);
            int forcaDesafiado = (this.getDesafiado().getDestreza() / 2);
            int defDesafiado = (this.getDesafiado().getResistencia());
            
            // atributos desafiante
            int pvDesafiante = (this.getDesafiante().getConstituicao() * 4);
            int poderDesafiante = (this.getDesafiante().getInteligencia() / 2);
            int forcaDesafiante = (this.getDesafiante().getDestreza() / 2);
            int defDesafiante = (this.getDesafiante().getResistencia());
            
            // outros atributos
            boolean turno = true;
            int manaDesafiado = 15;
            int manaDesafiante = 15;
            
            Random d10 = new Random();
            int dano, ataque, protecao, rolagem;
            
            
            this.getDesafiado().status();
            this.getDesafiante().status();
            System.out.println("\n");
            System.out.println(this.getDesafiado().getNome() + " X " + this.getDesafiante().getNome());
            System.out.println("\n===================\n ");
            System.out.println(this.getDesafiado().getNome());
            System.out.println(" Vida: " + pvDesafiado);
            System.out.println(" Poder: " + poderDesafiado);
            System.out.println(" Destreza: " + forcaDesafiado);
            System.out.println(" Resistencia: " + defDesafiado);
            System.out.println("\n===================\n ");
            System.out.println(this.getDesafiante().getNome());
            System.out.println(" Vida: " + pvDesafiante);
            System.out.println(" Poder: " + poderDesafiante);
            System.out.println(" Destreza: " + forcaDesafiante);
            System.out.println(" Resistencia: " + defDesafiante);
            System.out.println("\n=================== ");
            System.out.println("\n");
            
                do
                {
                    if (turno == true)
                    {
                        // ataque desafiado
                        rolagem = d10.nextInt(10);
                            if (this.getDesafiado().getClasse().equals("Mago") || this.getDesafiado().getClasse().equals("Necromante"))
                            {
                                    if (manaDesafiado != 0)
                                    {
                                        switch (rolagem)
                                        {
                                            case 9:
                                                ataque = (poderDesafiado * 2) + 4;
                                                System.out.println("\nUm ataque critico! ");
                                                manaDesafiado = manaDesafiado - 1;
                                                break;
                                            default:
                                                ataque = poderDesafiado + 4;
                                                manaDesafiado = manaDesafiado - 1;
                                                break;
                                        } 
                                    }
                                    else 
                                    {
                                        switch (rolagem)
                                        {
                                            case 9:
                                                ataque = 2 * 2 + 4;
                                                break;
                                            default:
                                                ataque = 2 + 4;
                                                break;
                                        }
                                    }

                            
                            }else
                            {
                                switch (rolagem)
                                {
                                    case 9:
                                        ataque = (forcaDesafiado * 2) + 4;
                                        System.out.println("\nUm ataque critico! ");
                                        break;
                                    default:
                                        ataque = forcaDesafiado + 6;
                                        break;
                                }
                            }
                            
                            // calcular a defesa do desafiante
                            rolagem = d10.nextInt(10);
                            switch (rolagem)
                            {
                                case 9:
                                    protecao = (defDesafiante * 2) + 2;
                                    System.out.println("\nUma defesa critica! ");
                                    break;
                                default:
                                    protecao = defDesafiante + 2;
                            }
                            
                        // vendo se o ataque vai acertar
                            dano = ataque - protecao;
                            if (dano > 0)
                            {
                                pvDesafiante = pvDesafiante - dano;
                                System.out.println(this.getDesafiado().getNome() + " acertou um ataque (" + dano + ")");
                                System.out.println(this.getDesafiante().getNome() + " esta com " + pvDesafiante + " pontos de vida\n");
                            }
                            else
                            {
                                System.out.println(this.getDesafiado().getNome() + " lancou um ataque");
                                System.out.println(this.getDesafiante().getNome() + " esquivou");
                            }
                        turno = false;
                    }
                    
                    // vez do adversario
                    else
                    {
                        // ataque desafiante
                        rolagem = d10.nextInt(10);
                        if (this.getDesafiante().getClasse().equals("Mago")|| this.getDesafiante().getClasse().equals("Necromante"))
                        {
                            if (manaDesafiante != 0)
                            {
                                switch (rolagem)
                                {
                                    case 9:
                                        ataque = (poderDesafiante * 2) + 4;
                                        System.out.println("\nUm ataque critico! ");
                                        manaDesafiante -= 1;
                                        break;
                                    default:
                                        ataque = poderDesafiante + 4;
                                        manaDesafiante -= 1;
                                        break;
                                }                               
                            }
                            else 
                            {
                                switch (rolagem)
                                {
                                    case 9:
                                        ataque = 2 * 2 + 4;
                                        break;
                                    default:
                                        ataque = 2 + 4;
                                        break;
                                }
                            }

                        }
                        else
                        {
                           switch (rolagem)
                           {
                               case 9:
                                   ataque = (forcaDesafiante * 2) + 4;
                                   System.out.println("\nUm ataque critico! ");
                                   break;
                               default:
                                   ataque = forcaDesafiante + 6;
                                   break;
                           }
                        }
                        
                        // calcular defesa desafiado
                        rolagem = d10.nextInt(9);
                            switch(rolagem)
                            {
                                case 9:
                                    protecao = (defDesafiado * 2) + 2;
                                    System.out.println("\nUma defesa critica! ");
                                    break;
                                default:
                                    protecao = defDesafiado + 2;
                                    break;
                        }
                        
                        // vendo se o ataque do desafiante vai pegar
                        dano = ataque - protecao;
                            if (dano > 0)
                            {
                                pvDesafiado -= dano;
                                System.out.println(this.getDesafiante().getNome() + " acertou um ataque (" + dano + ")");
                                System.out.println(this.getDesafiado().getNome() + " esta com " + pvDesafiado + " pontos de vida\n");
                            }
                            else
                            {
                                System.out.println(this.getDesafiante().getNome() + " lancou um ataque");
                                System.out.println(this.getDesafiado().getNome() + " esquivou\n");
                            }
                        turno = true;
                    }
                }while (pvDesafiado > 0 && pvDesafiante > 0);
                
        // dizendo quem venceu
            if (pvDesafiado <= 0)
            {
                System.out.println("\n =================== ");
                System.out.println(" Vitoria de " + this.getDesafiante().getNome());
                System.out.println(" =================== ");
            }
            else
            {
                System.out.println("\n =================== ");
                System.out.println(" Vitoria de " + this.getDesafiado().getNome());
                System.out.println(" ===================");
            }
        }
        else
        {
            System.out.println("Batalha nao pode ser realizada.");
        }
    }
    
    public Personagem getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Personagem desafiado) {
        this.desafiado = desafiado;
    }

    public Personagem getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Personagem desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
