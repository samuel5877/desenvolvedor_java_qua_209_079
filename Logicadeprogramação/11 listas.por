programa {
  funcao inicio() {
    // declaração de vetor
    cadeia nomes[10] 
    inteiro idades[10]


    //entrada de dados
    para(inteiro i = 0; i < 10; i++)
     {
       escreva("informe o ", i+1, "º nome do usuario: ")
       leia(nomes[i])
       escreva("Iforme a idade do ", i+1, "º usuário: ")
       leia(idades[i])
     }

     //saída de dados
     para (inteiro i = 0; i < 10; i++)
     {
      escreva("Nome do ", i+1, "º usuário:", nomes[i], ".\n")
      escreva("Idade: ", idades[i])
     }
    }
  }

