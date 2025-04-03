DROP DATABASE IF EXISTS inteligencia_militar_db;
CREATE DATABASE inteligencia_militar_db;
USE inteligencia_militar_db;

CREATE TABLE potencia (
    id INT AUTO_INCREMENT PRIMARY KEY,
    potencia VARCHAR(100) UNIQUE NOT NULL,
    hostilidad VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(100) NOT NULL
);

CREATE TABLE tropas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    potencia VARCHAR(100) NOT NULL,
    frente VARCHAR(100) NOT NULL,
    numero_tropas INT NOT NULL,
    tipo_tropas VARCHAR(100) NOT NULL,
    hora_despliegue TIME NOT NULL,
    FOREIGN KEY (potencia) REFERENCES potencia(potencia)
);
