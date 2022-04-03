# Exercício pertencente à disciplina Programação Orientada a Objetos

## Crie um sistema para cardápio de restaurante

O sistema deverá permitir a Criação, Atualização, Remoção, Exibição e Listagem do(s) Pratos(s) no restaurante.
A classe Prato deve conter as seguintes características e comportamentos.

**Características:**

* id : long
* codigo : String
* nome : String
* calorias : int
* preco : double
* ingredientes : String

**Comportamentos:**

* String toString()    // Deve retornar um texto contendo o nome, calorias e preço do prato



Crie uma classe chamada GestaoCardapio, contendo as seguintes características e comportamentos.


**Características:**

* indice : int      // Indica em qual posição deve ser guardada a próxima instância de Prato
* pratos : Prato[]  // Matriz com 50 pratos

**Comportamentos:**

* void criar()
* void atualizar()
* void excluir()
* void exibir()
* void listar()
* void menu()

**Regras do sistema**

1. O comportamento criar() deve criar uma nova instância de Prato, preencher as características desta instância com informações fornecidas pelo usuário, e deve guardar esta instância de prato na matriz (pratos) na posição indicada pela variável indice.

2. A função exibir() deve pedir ao usuário para que digite o CODIGO e procure qual prato na matriz (pratos) possui um CODIGO idêntico. Os dados do prato encontrado devem ser exibidos na tela.

3. A função excluir() deve pedir ao usuário para digitar um CODIGO, e em seguida deve excluir o(s) prato(s) com este CODIGO da matriz (pratos)

4. A função atualizar() deve pedir ao usuário para digitar um CODIGO, e em seguida deve procurar pelo primeiro prato na matriz (pratos) que contenha este CODIGO. A função deve  em seguida solicitar ao usuário para que digite os demais dados do prato (nome, calorias, preco e ingredientes) para trocar os valores das características do prato encontrado na matriz pelos valores recém informados pelo usuário.

5. O método menu() deve rodar em um loop infinito, mostrando na tela as opções para o usuário:
	
	5.1. (C)riar  (E)xibir  (R)emover  (A)tualizar	 (L)istar  (S)air
	
	5.2. Pegue a primeira letra digitada pelo usuário e assuma como sendo a opção escolhida
	
		5.2.1. String textoMaiusculo = scan.nextLine().toUpperCase();
	
		5.2.2. char letra = textoMaiusculo.charAt(0);
	
	5.3. Conforme a opção escolhida o método deve invocar a função correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.