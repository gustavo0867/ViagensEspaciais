DROP TABLE IF EXISTS Viagemestacaolunar;
DROP TABLE IF EXISTS Viagemviagemmarte;
DROP TABLE IF EXISTS Viagemorbitaterrestre;
DROP TABLE IF EXISTS Agendamentos;
DROP TABLE IF EXISTS Viagem;
DROP TABLE IF EXISTS clientes; 
DROP TABLE IF EXISTS Empresas;



CREATE TABLE Viagem(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Tempo_viagem INT NOT NULL,
    Total_pessoas INT NOT NULL,
    Classe INT NOT NULL
     );
 
CREATE TABLE clientes ( 
    CPF VARCHAR(15) NOT NULL PRIMARY KEY, 
    Telefone VARCHAR(15) NOT NULL, 
    Nome VARCHAR(60) NOT NULL); 

CREATE TABLE Empresas (
    CNPJ VARCHAR(20) NOT NULL PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    CapacidadePassageiros INT NOT NULL,
    NumeroNavesEspaciais INT NOT NULL,
    AlcanceEspacial FLOAT NOT NULL
);
CREATE TABLE Viagemestacaolunar(
    orbita_lua INT NOT NULL,
    tipo_de_pacotelunar INT NOT NULL,
    ViagemID INT NOT NULL,
    FOREIGN KEY (ViagemID) REFERENCES Viagem(Sequencial));
CREATE TABLE Viagemviagemmarte(
    visitar_lua INT NOT NULL,
    lembranca_marte BOOLEAN NOT NULL,
    ViagemID INT NOT NULL,
    FOREIGN KEY (ViagemID) REFERENCES Viagem(Sequencial));

CREATE TABLE Viagemorbitaterrestre(
    PeriodoOrbital FLOAT NOT NULL,
    Tipo_orbita INT NOT NULL,
    ViagemID INT NOT NULL,
    FOREIGN KEY (ViagemID) REFERENCES Viagem(Sequencial));


CREATE TABLE Agendamentos(
    Sequencial INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClienteId VARCHAR(15) NOT NULL,
    EmpresaId VARCHAR(20) NOT NULL,
    ViagemId INT NOT NULL,
    MetodoPagamento INT NOT NULL,
    DataHora Timestamp NOT NULL,
    FOREIGN KEY (ClienteId) REFERENCES clientes(CPF),
    FOREIGN KEY (EmpresaId) REFERENCES empresas(CNPJ),
    FOREIGN KEY (ViagemId) REFERENCES Viagem(Sequencial));


