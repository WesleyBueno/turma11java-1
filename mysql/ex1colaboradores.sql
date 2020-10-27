create database db_sistema_rh;
use db_sistema_rh;
create table colaboradores(
id_cracha int not null auto_increment,
nome varchar(30),
nascimento date,
sexo enum ("M", "F", "A"),
cargo varchar(30),
salario decimal (7,2),
primary key (id_cracha)
)engine=innodb;


insert into colaboradores ( id_cracha, nome, nascimento, sexo, cargo, salario)values
 (id_cracha, "Janaina", "1998-02-03","F", "analista jr", 1900.00),
 (id_cracha,"Esther", "1998-02-04","F", "analista pl", 2000.00),
 (id_cracha, "Luan", "1998-02-04","M", "gerente", 3800.00),
 (id_cracha, "Sandra", "1998-02-03", "A", "diretor", 22000.00);
 
 
 select * from colaboradores where salario > 2000;
 select * from colaboradores where salario < 2000;


