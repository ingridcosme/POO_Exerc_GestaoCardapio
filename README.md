# Exerc�cio pertencente � disciplina Programa��o Orientada a Objetos

## Crie um sistema para card�pio de restaurante

O sistema dever� permitir a Cria��o, Atualiza��o, Remo��o, Exibi��o e Listagem do(s) Pratos(s) no restaurante.
A classe Prato deve conter as seguintes caracter�sticas e comportamentos.

**Caracter�sticas:**

* id : long
* codigo : String
* nome : String
* calorias : int
* preco : double
* ingredientes : String

**Comportamentos:**

* String toString()    // Deve retornar um texto contendo o nome, calorias e pre�o do prato



Crie uma classe chamada GestaoCardapio, contendo as seguintes caracter�sticas e comportamentos.


**Caracter�sticas:**

* indice : int      // Indica em qual posi��o deve ser guardada a pr�xima inst�ncia de Prato
* pratos : Prato[]  // Matriz com 50 pratos

**Comportamentos:**

* void criar()
* void atualizar()
* void excluir()
* void exibir()
* void listar()
* void menu()

**Regras do sistema**

1. O comportamento criar() deve criar uma nova inst�ncia de Prato, preencher as caracter�sticas desta inst�ncia com informa��es fornecidas pelo usu�rio, e deve guardar esta inst�ncia de prato na matriz (pratos) na posi��o indicada pela vari�vel indice.

2. A fun��o exibir() deve pedir ao usu�rio para que digite o CODIGO e procure qual prato na matriz (pratos) possui um CODIGO id�ntico. Os dados do prato encontrado devem ser exibidos na tela.

3. A fun��o excluir() deve pedir ao usu�rio para digitar um CODIGO, e em seguida deve excluir o(s) prato(s) com este CODIGO da matriz (pratos)

4. A fun��o atualizar() deve pedir ao usu�rio para digitar um CODIGO, e em seguida deve procurar pelo primeiro prato na matriz (pratos) que contenha este CODIGO. A fun��o deve  em seguida solicitar ao usu�rio para que digite os demais dados do prato (nome, calorias, preco e ingredientes) para trocar os valores das caracter�sticas do prato encontrado na matriz pelos valores rec�m informados pelo usu�rio.

5. O m�todo menu() deve rodar em um loop infinito, mostrando na tela as op��es para o usu�rio:
	
	5.1. (C)riar  (E)xibir  (R)emover  (A)tualizar	 (L)istar  (S)air
	
	5.2. Pegue a primeira letra digitada pelo usu�rio e assuma como sendo a op��o escolhida
	
		5.2.1. String textoMaiusculo = scan.nextLine().toUpperCase();
	
		5.2.2. char letra = textoMaiusculo.charAt(0);
	
	5.3. Conforme a op��o escolhida o m�todo deve invocar a fun��o correspondente criar(), exibir(), excluir(), atualizar() ou System.exit(0) para sair do sistema.