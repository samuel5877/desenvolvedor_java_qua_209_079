programa {
  funcao inicio() {
    // declaração de variáveis
    cadeia nome
    real nota

    //entrada de dados
    escreva("informe seu nome:")
    leia(nome)
    escreva("informe sua nota:")
    leia(nota)


    //verifica se a nota é valida
    se (nota >= 0 e nota <= 10)
    {
      se (nota >= 7)escreva(nome, " está aprovado.")
      senao se(nota >= 5) escreva(nome, " esta de recuperação.")
      senao escreva(nome, " está reprovado.")
    }
    senao
    {
      escreva(nota, " Nota inválida.")
    }
  }
}
