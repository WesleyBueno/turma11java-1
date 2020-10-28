create database db_cidade_das_carnes;
use db_cidade_das_carnes;
#tb_produto e tb_categoria

create table tb_categoria(
id_categoria int(10) not null auto_increment,
nome varchar(30),
primary key (id_categoria)
)engine = innodb;


create table tb_produto(
id_produto int (10) not null auto_increment,
nome varchar (30),
preco decimal(7,2),
peso varchar (20),
validade date,
id_categoria int,
primary key (id_produto),
constraint fk_produto foreign key (id_categoria) references tb_categoria(id_categoria)
)engine=innodb;

insert into tb_produto (id_produto,nome, preco, peso, validade, id_categoria)values
	(default,'Bife Ancho','150.00','Kg','2020-10-31',1),
    (default,'Chorizo','100.00','Kg','2020-10-29',2),
    (default,'Assado de Tira','40.00','Kg','2020-10-31',3),
    (default,'Filé de Costela (Ribeye)','39.99','Kg','2020-10-31',4),
    (default,'Tomahawk','150.00','Kg','2020-10-31',5),
    (default,'Contra-filé (New York Strip)','150.00','Kg','2020-10-31',3),
    (default,'Filet Mignon','85.00','Kg','2020-10-31',1),
    (default,'Picanha','90.00','Kg','2020-10-31',5);
    
insert into tb_categoria (id_categoria, nome)values
	(default,'Comercial (Nelore)'),
    (default,'100% angus'),
    (default,'Prime'),
    (default,'100% Wagyu'),
    (default,'Dry Aged');
    
    select * from tb_produto
    inner join tb_categoria
    where tb_produto.id_categoria =  tb_categoria.id_categoria
    and tb_produto.preco > '50' ;
    
    select * from tb_produto
    inner join tb_categoria
    where tb_produto.id_categoria =  tb_categoria.id_categoria
    and tb_produto.preco > '3' and tb_produto.preco < '60' ;
    
    select * from tb_produto where nome  like '%Co%';
    
    select * from tb_produto where tb_produto.id_categoria like 1;