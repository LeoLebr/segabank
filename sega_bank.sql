-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.7.23 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Création de la base sega_bank
DROP DATABASE IF EXISTS sega_bank;
CREATE DATABASE IF NOT EXISTS sega_bank /*!40100 DEFAULT CHARACTER SET latin1 */;
USE sega_bank;

-- Création de la table compte
DROP TABLE IF EXISTS compte;
CREATE TABLE IF NOT EXISTS compte (
    id int(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    type int(1) NOT NULL,
    solde float NOT NULL,
    decouvert float DEFAULT NULL,
    taux_inter float DEFAULT NULL,
    agence_id int(20) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- Ajout de données dans la table compte
/*!40000 ALTER TABLE `compte` DISABLE KEYS */;
INSERT INTO compte(id, type, solde, decouvert, taux_inter, agence_id)
VALUES
    (1, 2, 2000, NULL, 2, 2),
    (2, 1, -1080, 1280, 3, 3),
    (3, 2, 457, NULL, NULL, 1),
    (4, 3, 1243, NULL, 1, 2),
    (5, 1, 20, 520, NULL, 1);
/*!40000 ALTER TABLE `compte` ENABLE KEYS */;

-- Création de la table agence

DROP TABLE IF EXISTS agence;
CREATE TABLE IF NOT EXISTS agence (
    id int(5) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    code varchar(10) NOT NULL,
    adresse varchar(100) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Ajout de données dans la table agence
/*!40000 ALTER TABLE `agence` DISABLE KEYS */;
INSERT INTO agence (id, code, adresse)
VALUES
    (1, 'AG100', '10 rue'),
    (2, 'AG100', '3 impasse'),
    (3, 'AG100', '7 avenue');
/*!40000 ALTER TABLE `agence` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

