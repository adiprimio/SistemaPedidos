CREATE TABLE Cliente (
Cod_Cliente serial PRIMARY KEY,
Email character(50),
Login_Cliente character(20),
Nome_Cliente character(30),
Sobrenome_Cliente character(40),
Endereco character(50),
Senha character(40)
);

CREATE TABLE Categoria (
Cod_Categoria serial PRIMARY KEY,
Nome_Categ character(20)
);

CREATE TABLE Subcategoria (
Nome_SubCateg character(20),
Cod_SubCateg serial PRIMARY KEY,
Cod_Categoria int,
FOREIGN KEY(Cod_Categoria) REFERENCES Categoria (Cod_Categoria)
);

CREATE TABLE Produto (
Cod_Produto serial PRIMARY KEY,
Nome character (20),
Descricao character(500),
Preco numeric(12,2),
Cod_SubCateg int,
FOREIGN KEY(Cod_SubCateg) REFERENCES SubCategoria (Cod_SubCateg)
);

CREATE TABLE Tipo (
Cod_Tipo serial PRIMARY KEY,
Nome_Tipo character(10)
);

CREATE TABLE Promocao (
Cod_Promocao serial PRIMARY KEY,
Desconto numeric(3),
Cod_Produto int,
FOREIGN KEY(Cod_Produto) REFERENCES Produto (Cod_Produto)
);

CREATE TABLE Historico (
Cod_Historico serial PRIMARY KEY,
Data_Hora numeric(10),
Cod_Cliente int,
Cod_Tipo int,
Cod_Produto int,
FOREIGN KEY(Cod_Cliente) REFERENCES Cliente (Cod_Cliente),
FOREIGN KEY(Cod_Tipo) REFERENCES Tipo (Cod_Tipo),
FOREIGN KEY(Cod_Produto) REFERENCES Produto (Cod_Produto)
);

CREATE TABLE Pedido (
Cod_Pedido serial PRIMARY KEY,
Dt_Pedido character(10),
Situacao_Pedido character(3),
Cod_Cliente int,
FOREIGN KEY(Cod_Cliente) REFERENCES Cliente (Cod_Cliente)
);

CREATE TABLE Recomendacao (
Cod_Recomendacao serial PRIMARY KEY,
Tipo character(10),
Cod_Produto int,
Cod_Produto_Recomendado int,
FOREIGN KEY(Cod_Produto) REFERENCES Produto (Cod_Produto),
FOREIGN KEY(Cod_Produto_Recomendado) REFERENCES Produto (Cod_Produto)
);

CREATE TABLE Item_Pedido (
Cod_Item_Pedido serial PRIMARY KEY,
Cod_Produto int,
Cod_Pedido int,
FOREIGN KEY(Cod_Produto) REFERENCES Produto (Cod_Produto),
FOREIGN KEY(Cod_Pedido) REFERENCES Pedido (Cod_Pedido)
);