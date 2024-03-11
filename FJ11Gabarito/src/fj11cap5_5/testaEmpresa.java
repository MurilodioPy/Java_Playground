/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fj11cap5_5;

import java.time.LocalDate;


public class testaEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.nome = "PROEG";
        empresa.cnpj = "1234/321";
        empresa.empregados = new Funcionario[2];

        Funcionario f1 = new Funcionario();
        

        f1.nome = "Diego";
        f1.dataEntrada = LocalDate.now().toString();
        f1.departamento = "COTIC";
        f1.rg = "1111111";
        f1.salario = 2000;

        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();


        f2.nome = "Fabian";
        f2.dataEntrada = LocalDate.now().toString();
        f2.departamento = "COTIC";
        f2.rg = "2222222";
        f2.salario = 2000;

        empresa.adiciona(f2);

        Funcionario f3 = new Funcionario();


        f3.nome = "Juan";
        f3.dataEntrada =  LocalDate.now().toString();
        f3.departamento = "COTIC";
        f3.rg = "333333";
        f3.salario = 1000;

        empresa.adiciona(f3);

        empresa.mostraEmpregados();
    }

}
