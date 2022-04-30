CREATE TABLE carro (
  id BIGINT  NOT NULL,
   modelo VARCHAR(255),
   ano_fabricacao BIGINT,
   cor VARCHAR(255),
   TIMESTAMP  timestamp ,
   CONSTRAINT pk_carro PRIMARY KEY (id)
);

CREATE TABLE pessoa (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   idade INT,
   CONSTRAINT pk_pessoa PRIMARY KEY (id)
);

INSERT
INTO
  carro
  (modelo, ano_fabricacao, cor, timestamp)
VALUES
  ('VW', 2010, 'preto', NOW());

INSERT
INTO
  pessoa
  (nome, idade)
VALUES
  ('Sueliton', 0);
