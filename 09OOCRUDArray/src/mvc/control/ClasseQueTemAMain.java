/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.control;


import mvc.model.Filme;
import mvc.model.FilmeDAORAM;
import mvc.model.Usuario;
import mvc.model.UsuarioDAORAM;
import mvc.view.GUI;

/**
 *
 * @author EDYA
 */
public class ClasseQueTemAMain {
    
    GUI gui = new GUI();
    UsuarioDAORAM usuarioDAORAM = new UsuarioDAORAM();
    FilmeDAORAM filmeDAORAM = new FilmeDAORAM();
    
    //passando os usuários para o construtor da classe
    FilmeDAORAM teste = new FilmeDAORAM(usuarioDAORAM);
    
    public ClasseQueTemAMain() {
        //SUPONHA QUE A CLASSE FILME PRECISA DE USUÁRIOS.
        //PARA POPULAR A MEMÓRIA OU NO MEIO DO PROGRAMA
        //(i) posso passar via construtor (acima)
        //(ii) posso passar por um método
        filmeDAORAM.metodoQualquerUsaUsuarios1(usuarioDAORAM);
        
        
        do {
            int opcaoUsuario = gui.menuBoasVindas();

            //o loop do programa como outros exemplos
            switch (opcaoUsuario) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
                
            }
            
        } while (true);
        //dao.inserir(null);
    }
    
    public static void main(String[] args) {
        new ClasseQueTemAMain();
    }
    
}
