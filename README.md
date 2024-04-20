# Exercício - Sistema de Cadastro de Hoteis para Desktop em Banco MySQL utilizando DAO para a IDE NetBeans.

## Contextualização

 - O projeto foi desenvolvido no NetBeans deve ser chamado exercicio_cadastrohotel_desktop_bd_dao_netbeans.<br>
 - Programa desenvolvido no Java Development Kit 1.8.<br>
 - Utiliza o Apache Maven para a automatização da construção.<br>
 - Este programa possui diversas classes organizada nos pacotes: principal, visao, modelo e dao.<br>
 - Utiliza o Data Acess Object (DAO) para abstrair o bancos de dados MySQL.<br>
 - Toda iteração com banco de dados é tratada diretamente pelo DAO.<br>
 - Os dados de configuração(Servidor, Database, Usuario, Senha) da integração do java com o banco de dados estão no arquivo src/dao/DadosBanco.java.<br>
 - Dependência do Driver JDBC foi especificada no arquivo pom.xml.<br>
 - O Driver de conexão com o MySQL e espeficado na classe Conexao.java.<br>
 - Crie o banco de dados antes de executar o programa, as especificações da tabela estão no arquivo banco.sql.<br>
 - A pasta src contêm os fontes do projeto.<br>
 - A interface gráfica foi construída **com** o auxílio da IDE NetBeans.<br>

## Arquivos

- banco.sql - Script do banco de dados.
- pom.xml - Arquivo de configuração da ferramenta de automação Maven.

## Enunciado do problema

### Questão 1

Uma rede de hotéis chamada Aterrissar necessita de um sistema para desktop em Java para cadastrar os seus hotéis em um banco de dados. As informações referentes a cada hotel que devem ser preenchidas são as seguintes: Nome, Cidade, Quartos, Valor diária e número de estrelas. A tabela e o banco de dados têm o nome “hotel”. A tabela tem a seguinte estrutura:

CREATE TABLE hotel (
	hotelID         INTEGER NOT NULL AUTO_INCREMENT,    	 
	nome            VARCHAR(100) NOT NULL,     
	cidade          VARCHAR(50) NOT NULL,     
	quartos         INTEGER NOT NULL,     
	valorDiaria     DECIMAL(9,2) NOT NULL,
	estrelas        INTEGER NOT NULL,     
	PRIMARY KEY(hotelID)    
);

O layout do janela é apresentado abaixo:

![tela1](tela1.png)  

Esta interface gráfica, além dos campos, possui sete botões. O botão com o nome "Sair" fecha a janela e sai do sistema. O botão com o nome “Limpar” limpa as caixas de texto da janela. Quando for clicado, o botão “Salvar” enviará as informações ao banco de dados. A caixa de texto para o nome do hotel deve ter o seu preenchimento obrigatório, faça a validação. As funcionalidades dos outros botões serão implementadas posteriormente.

Desenvolva uma interface gráfica baseada em JFrame do pacote Swing para o cadastro de hotel, contendo as informações acima. Utilize o banco de dados de sua preferência. Ao final do processamento deve ser exibida uma mensagem informando se o usuário conseguiu ou não realizar a inclusão dos dados.

Você deve apresentar todo o código fonte utilizado para desenvolver a interface e a inclusão no banco de dados. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema se for necessário.

### Questão 2

Você já realizou a inclusão dos dados de hotéis no banco de dados na questão 1. Agora, a mesma empresa necessita listar os dados de seus hotéis que estão armazenados no banco de dados. A chamada desta funcionalidade será através do botão chamado “Listar” da questão anterior. As informações e o layout dos dados a serem exibidos são apresentados na figura abaixo:

![tela2](tela2.png)

Desenvolva uma interface gráfica baseada em JFrame que contêm um componente JTable para exibir os dados de hotéis armazenados.  Utilize o mesmo banco e tabela da questão 1. Ao se clicar no botão “Fechar” deve se retornar a janela anterior.

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.


### Questão 3

Após realizar a listagem dos dados na questão 2, a empresa necessita disponibilizar uma interface gráfica para a alteração dos dados de seus hotéis que estão armazenados no banco de dados. Para localizar o hotel cujos dados devem ser alterados é necessário ser informado um o id do hotel. A interface deve ter o seguinte formato(Sugestão utilize JOptionPane):

![tela3](tela3.png) 

Esta interface gráfica deve ser chamada pelo botão “Alterar” da interface gráfica da questão 1.

Logo após a digitação do id os dados do hotel devem ser exibidos na interface gráfica desenvolvida na questão 1 para que sejam alterados. Se o id do hotel não existir, deve ser exibida uma mensagem ao usuário. O botão “Cadastrar” altera os dados do hotel. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.


### Questão 4

Com as funcionalidades de inclusão, listagem e alteração dos dados de hoteis prontos, agora a empresa necessita disponibilizar a interface gráfica para a exclusão dos dados de hotéis que estão armazenados no banco de dados. Para localizar o hotel a ser excluído do banco de dados é necessário ser informado um id de hotel. A interface gráfica deve ter o seguinte formato:

![tela4](tela4.png)  

Esta interface gráfica deve ser chamada pelo botão “Excluir” da interface gráfica da questão 1.

Logo após a digitação do id, todos os dados do hotel que foi localizado deve ser exibido na interface gráfica desenvolvida na questão 1 e logo após é exigido a confirmação da exclusão com a interface a seguir:

![tela5](tela5.png) 

Se o id do hotel não existir, deve ser exibida uma mensagem ao usuário. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema. 

### Questão 5

Com as funcionalidades de inclusão, listagem e alteração e exclusão dos dados de veículos prontos, agora a empresa necessita disponibilizar a interface gráfica para o reajuste do valor da diária dos hotéis que estão armazenados no banco de dados. O usuário deve especificar um valor em percentual para o valor de reajuste do valor da diária de todos os hotéis. A interface gráfica deve ter o seguinte formato:

![tela6](tela6.png) 

Esta interface gráfica deve ser chamada pelo botão “Reajuste” da interface gráfica da questão 1.

Logo após a digitação do valor em percentual, deve ser exibido a quantidade de hotéis que tiveram o valor reajustado, conforme a interface a seguir:

![tela7](tela7.png)  

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema. 
