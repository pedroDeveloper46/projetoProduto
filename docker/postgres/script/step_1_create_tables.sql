CREATE TABLE IF NOT EXISTS projetoproduto.produto (
    id bigint DEFAULT nextval('projetoproduto.produto_id_seq') PRIMARY KEY,
    nome VARCHAR(50),
    descricao VARCHAR (100),
    status_produto VARCHAR(50),
    qtd_estoque BIGINT,
    estoque_minimo BIGINT,
    estoque_maximo BIGINT,
    preco_compra NUMERIC(10, 2),
    preco_venda NUMERIC(10, 2),
    bar_code VARCHAR(50),
    ncm BIGINT,
    fator NUMERIC(10, 2),
    imagem VARCHAR(200),
    data_cadastro TIMESTAMPTZ
);
