#criar o database chamado exercicio
create database if not exists exercicio;

#entrar no database exercicio
use exercicio;

#remove a tabela para recriá-la
drop table if exists hotel;

#cria a tabela de hotel
CREATE TABLE hotel (
	hotelID     INTEGER NOT NULL AUTO_INCREMENT,    	 
	nome        VARCHAR(100) NOT NULL,     
	cidade      VARCHAR(50) NOT NULL,     
	quartos     INTEGER NOT NULL,     
	valorDiaria DECIMAL(9,2) NOT NULL,
	estrelas    INTEGER NOT NULL,     
	PRIMARY KEY(hotelID)    
);

#lista a tabela criada
show tables;
