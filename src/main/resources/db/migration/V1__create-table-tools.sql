CREATE TABLE tools (
    id BIGINT NOT NULL AUTO_INCREMENT,
    num_ativo VARCHAR(10) NOT NULL,
    num_peca VARCHAR(10) NOT NULL UNIQUE,
    num_equipamento VARCHAR(10) NOT NULL UNIQUE,
    descricao VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,  -- Changed to INT for numerical values

    PRIMARY KEY (id)
);
