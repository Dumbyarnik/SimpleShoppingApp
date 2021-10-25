-- DROP TABLE IF EXISTS  `simpleshop`.`ware` ;


CREATE TABLE IF NOT EXISTS `simpleshop`.`warenrepository` (
  `warenreponr` SMALLINT UNSIGNED NOT NULL,
  `warenreponame` VARCHAR(45) NOT NULL,
  `warenrepo_beschreibung` VARCHAR(77) NULL DEFAULT NULL,
  PRIMARY KEY (`warenreponr`));

CREATE TABLE `simpleshop`.`ware` (
 `warennr` TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
 `warenname` VARCHAR(45) NOT NULL,
 `ware_beschreibung` VARCHAR(77) NULL,
 `ware_typ` VARCHAR(45) NULL,
 `ware_preis` VARCHAR(45) NULL,
 `ware_einheit` VARCHAR(45) NULL DEFAULT NULL,
 `warenrepository_warenreponr` SMALLINT UNSIGNED NOT NULL,
  PRIMARY KEY (`warennr`),
  CONSTRAINT `fk_warenrepository_nr1`
    FOREIGN KEY (`warenrepository_warenreponr`)
    REFERENCES `simpleshop`.`warenrepository` (`warenreponr`));


CREATE TABLE IF NOT EXISTS `simpleshop`.`produktinformation` (
  `produktinfo_nr` TINYINT UNSIGNED NOT NULL,
  `produktinfo_bezeichnung` VARCHAR(77) NULL DEFAULT NULL,
  `ware_warennr` TINYINT UNSIGNED NOT NULL,
  PRIMARY KEY (`produktinfo_nr`),
  INDEX `fk_produktinformation_ware1_idx` (`ware_warennr` ASC) VISIBLE,
  CONSTRAINT `fk_produktinformation_ware1`
    FOREIGN KEY (`ware_warennr`)
    REFERENCES `simpleshop`.`ware` (`warennr`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

