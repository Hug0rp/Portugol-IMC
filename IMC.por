programa {
  funcao real imc(real altura, real peso){
    retorne peso / (altura * altura)
  }
  funcao cadeia classificar(real imc, cadeia genero){
    se(genero == "m" e imc <= 20){
    retorne "Abaixo do peso"
    }
    se(genero == "m" e imc > 20 e imc < 24.9){
    retorne "normal"
    }
    se(genero == "m" e imc >= 25 e imc < 29.9 ){
    retorne "Obesidade leve"
    }
    se(genero == "m" e imc >= 30 e imc < 39.9 ){
    retorne "Obesidade moderada"
    }
    se(genero == "m" e imc > 40){
    retorne "Obesidade mórbida"
    } senao
    se(genero == "f" e imc <= 19){
    retorne "Abaixo do peso"
    }
    se(genero == "f" e imc > 19 e imc < 23.9 ){
    retorne "Normal"
    }
    se(genero == "f" e imc >= 24 e imc < 28.9){
    retorne "Obesidade leve"
    }
    se(genero == "f" e imc >= 29 e imc < 38.9){
    retorne "Obesidade moderada"
    }
    se(genero == "f" e imc > 39 ){
    retorne "Obesidade mórbida"
    }
  }
  funcao inicio() {
    real altura, peso, imc
    cadeia genero, nome, calculo
    
    escreva("Escreva seu nome: ")
    leia(nome)
    escreva("Escreva seu gênero (m/f): ")
    leia(genero)
    escreva("Escreva sua altura: ")
    leia(altura)
    escreva("Escreva seu peso: ")
    leia(peso)
    enquanto(altura e peso == 0){
    escreva("Número inválido!")
    }
    imc = imc(altura, peso)
    calculo = classificar(imc, genero)
    se(genero == "m"){
    escreva("Olá ", nome, "! Seu IMC é ", imc, " e sua classificação é ", calculo, " para o gênero masculino. " )}
    senao se(genero == "f")
    escreva("Olá ", nome, "! Seu IMC é ", imc, " e sua classificação é ", calculo, " para o gênero feminino. " )
    }
  }

  
  
