

drop table `simpleshop`.`produktinformation`;
drop table `simpleshop`.`ware`;
drop table `simpleshop`.`warenrepository`;

  
INSERT INTO `simpleshop`.`warenrepository`(warenreponr, warenreponame,warenrepo_beschreibung)
value ('1', 'Musik','MP3, CD, Vinyl ');

INSERT INTO `simpleshop`.`warenrepository`(warenreponr, warenreponame,warenrepo_beschreibung)
value ('2', 'Musik','MP3, CD, Vinyl ');

INSERT INTO `simpleshop`.`warenrepository`(warenreponr, warenreponame,warenrepo_beschreibung)
value ('3', 'Buch','Buch, Magazine, Comic');

select * from  `simpleshop`.`warenrepository`;

-- more random shit

select warenreponr, warenreponame, warenrepo_beschreibung, warenname,ware_beschreibung,ware_typ,ware_preis
 from `simpleshop`.`warenrepository` w1, `simpleshop`.`ware` w2
where w1.ware_warennr = w2.warennr;

delete from `simpleshop`.`warenrepository`
where warenreponr = 2;



INSERT INTO `simpleshop`.`ware`(warennr, warenname,ware_beschreibung,ware_typ,ware_preis, ware_einheit, warenrepository_warenreponr)
value ('1', 'Nas','Exclusive Crystal Clear Edition', 'Vinyl', 17.49, 'EUR', 1);

INSERT INTO `simpleshop`.`ware`(warennr, warenname,ware_beschreibung,ware_typ,ware_preis, ware_einheit, warenrepository_warenreponr)
value ('2', 'Isak Gaines','Revelries Part 1 & 2', 'Vinyl',9.49, 'EUR', 1);

INSERT INTO `simpleshop`.`ware`(warennr, warenname,ware_beschreibung,ware_typ,ware_preis, ware_einheit, warenrepository_warenreponr)
value ('3', 'Java-Hamster-Modell','Programmieranfänger ', 'Buch', 4.12, 'EUR', 1);


INSERT INTO `simpleshop`.`produktinformation`(produktinfo_nr, produktinfo_bezeichnung, ware_warennr)
value ('1', 'gut', 1);

INSERT INTO `simpleshop`.`produktinformation`(produktinfo_nr, produktinfo_bezeichnung, ware_warennr)
value ('2', 'sehr gut', 3);

INSERT INTO `simpleshop`.`produktinformation`(produktinfo_nr, produktinfo_bezeichnung, ware_warennr)
value ('3', 'naja', 3);

select * from `simpleshop`.`produktinformation`;

-- random shit

select  warennr, warenname,ware_beschreibung,ware_typ,ware_preis, produktinfo_bezeichnung 
 from  `simpleshop`.`ware` w, `simpleshop`.`produktinformation` p
where w.produktinformation_produktinfo_nr = p.produktinfo_nr;

select warennr, warenname,ware_beschreibung,ware_typ,ware_preis, produktinfo_bezeichnung
 from  `simpleshop`.`ware` , `simpleshop`.`produktinformation` 
inner join `simpleshop`.`ware` on produktinformation_produktinfo_nr = produktinfo_nr;

delete from `simpleshop`.`ware`
where warennr = 2;

select * from  `simpleshop`.`ware`;

-- random shit end


