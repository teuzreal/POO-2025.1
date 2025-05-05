## Cap 6 - Vetor
### EXERCICIOS RESOLVIDOS

1 - Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números
primos e suas respectivas posições.

2 - Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O
vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.
O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de
cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços
e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez).
Depois, determine e mostre:

■ um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final,
deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e

■ o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).

3 - Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetorresultante
da intercalação deles.

4 - Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores
resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos.
Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente
utilizadas.

5 - Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre
os seguintes vetores resultantes:

■ A união de X com Y

(todos os elementos de X e de Y sem repetições).

6 - Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resul-
tante de uma ordenação decrescente.

7 - Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene
de forma crescente.

8 - Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-os
de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições, composto pela junção
dos elementos dos vetores anteriores, também ordenado de maneira crescente.

9 - Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler
informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze
aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um
menu com as seguintes opções:

■ consultar;
■ efetuar reserva; e
■ sair.

Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes
opções:

■ por número do voo;
■ por origem; e
■ por destino.

Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pes-
soa deseja viajar. O programa deverá dar as seguintes respostas:

■ reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
■ voo lotado — caso não exista lugar disponível nesse voo;
■ voo inexistente — caso o código do voo não exista.

A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação
de consulta ou reserva, o programa volta ao menu principal.

10 - Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada
questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros da-
dos são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.
Calcule e mostre:

■ o número e a nota de cada aluno; e
■ a porcentagem de aprovação, sabendo-se que a nota mínima é 6.

## Cap 8 - Sub-rotina
### EXERCICIOS RESOLVIDOS

1 - Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se
for negativo.

2 - Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro e retorne
a soma dos N números inteiros existentes entre eles.

3 - Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior
que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e
c) e retornar o resultado para ser impresso.

4 - Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina deverá convertê-lo
para horas, minutos e segundos. Todas as variáveis devem ser passadas como parâmetro, não
havendo variáveis globais.

5 - Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que
determine o percentual de acréscimo entre esses valores. O resultado deverá ser mostrado no programa
principal.

6 - Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte
tabela de multiplicação (no exemplo, n = 9):

7 - Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros
e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se
for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida
ao programa principal para, então, ser mostrada.

8 - Crie uma sub-rotina que receba como parâmetro a hora de início e a hora de término de um jogo,
ambas subdivididas em dois valores distintos: horas e minutos. A sub-rotina deverá retornar a duração
expressa em minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que
ele pode começar em um dia e terminar no outro.

9 - Faça uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.

10 - Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S,
obtido pelo seguinte cálculo:

S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
