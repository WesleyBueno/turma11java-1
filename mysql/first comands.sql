#criando um banco de dados:
create database Ford;
#apagar banco de dados:
drop database Ford;
#usado para acessar/mostrar banco de dados:
show databases; 
use aula1;
create table funcionarios(
nome varchar(30),
idade tinyint,
sexo char(1),
peso float,
altura float,
nacionalidade varchar(20)
);
insert into funcionarios values ("Juliana",22,"f",60, 1.65, "Brasileira");

insert into funcionarios (nome, sexo) values ("Marcio", "m");

#GET para selecionar todos os dados na tabela:
select * from funcionarios;
#POST/ mostrar
insert into funcionarios values
	("Marcela", 22 , "f", 60, 1.65,"Brasileira"),
	("Gabriel", 22 , "m", 60, 1.65,"Brasileiro"),
    ("Juliana", 22 , "f", 60, 1.65,"Brasileira");
#PUT= update -alter para alterar linha
update funcionarios set nacionalidade= "Argentino" where nome= "Gabriel";

#mostrar todos os elementos da tabela:
show tables;
#mostra a estrutura da tabela:
describe funcionarios;
#dados da tabela:
select * from funcionarios;
select nome from funcionarios;
select nome, nacionalidade from funcionarios;


    
    


