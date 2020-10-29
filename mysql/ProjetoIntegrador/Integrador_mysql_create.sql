#Grupo 5-SquadClubeDosCinco
#De acordo com a análise geral do grupo, entramos em consenso de que essas categorias estariam mais alinhadas com o projeto, 
#com o produto e o a missão principal do e-commerce.

CREATE TABLE `Produto` (
	`id_prod` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(50) NOT NULL,
	`preco` DECIMAL((10,2)) NOT NULL,
	`Descrição` varchar(255) NOT NULL,
	`peso` DECIMAL((10,2)) NOT NULL,
	`id_cat` INT NOT NULL,
	PRIMARY KEY (`id_prod`)
);

CREATE TABLE `Usuarios` (
	`id_user` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(50) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id_user`)
);

CREATE TABLE `Categorias` (
	`id_cat` INT NOT NULL AUTO_INCREMENT,
	`nome` varchar(50) NOT NULL,
	`material_rec` varchar(50) NOT NULL,
	PRIMARY KEY (`id_cat`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`id_cat`) REFERENCES `Categorias`(`id_cat`);

