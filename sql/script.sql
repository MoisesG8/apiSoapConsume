CREATE DATABASE pruebatecnica

CREATE TABLE tasa_cambio (
    id SERIAL PRIMARY KEY,
    fecha DATE NOT NULL,
    tasa_venta DECIMAL(10, 5) NOT NULL,
    tasa_compra DECIMAL(10, 5) NOT NULL,
    num_peticion INTEGER
);

CREATE SEQUENCE num_peticion_seq;

ALTER TABLE tasa_cambio
ALTER COLUMN num_peticion
SET DEFAULT nextval('num_peticion_seq');
