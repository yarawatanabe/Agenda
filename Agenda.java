/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;


public class Agenda {
  
        public static void main (String[] args){
            
            String [] nome = new String [5];
            String [] end = new String [5];
            String [] tel = new String [5];
            
            for (int i = 0; i < 5; i++) {
                nome[i] = "";
                end[i] = "";
                tel [i] = "";
                
            }
            
            
            String opcao = "";
            String continuar = "";
            int posicao = 0;
            String excluirNome = "";
            
            Scanner ler = new Scanner (System.in);
                 
            do{
                
                System.out.println("Escolha o numero da opcao desejada: Incluir - Listar - Excluir - Sair ");
                opcao = ler.nextLine();
                
                switch (opcao) {
                    case "Incluir":
                        //Codigo de insercao
                        do{
                            System.out.println("Nome:");
                            nome[posicao] = ler.nextLine();
                            
                            System.out.println("Endereco:");
                            end [posicao] = ler.nextLine();
                            
                            System.out.println("Telefone:");
                            tel [posicao] = ler.nextLine();
                            
                            
                            System.out.println("Cadastrar novo usuario?");
                            continuar = ler.nextLine();
                            
                            posicao++;
                        }while(continuar.equals("Sim"));
                        
                        break;
                    
                    case "Listar":
                        //Codigo de listar
                        for (int i = 0; i < 4; i++) {
                            
                            if(!nome[i].equals("")){
                                
                                System.out.println(
                                    "Nome: " + nome[i] + " " +
                                    "Endereco: " + end [i] + " " +
                                    "Telefone: " + tel[i] + " ");
                                
                            }    
                        }
                        break;
                        
                    case "Excluir":
                        //Codigo  exluclusao
                        
                        System.out.println("Qual usuario deseja excluir?");
                        excluirNome = ler.nextLine();
                        
                        for (int i = 0; i < 5; i++) {
                           if(nome[i].equals(excluirNome)){
                               nome[i] = "";
                               end[i] = "";
                               tel[i] = "";
                           }
                            
                        }
                        break;
                        
                    case "Sair":
                        //Codigo para sair
                        System.out.println("Fim.");
                        return;
                    
                    default:
                        //Invalido
                        System.out.println("Opcao invalida!");
                        break;
                }
                
            }while (!opcao.equals("Sair"));
        }
}
