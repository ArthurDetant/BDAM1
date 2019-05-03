DROP TABLE Entreprises;

CREATE TABLE Entreprises (
idEntreprise int(11) NOT NULL auto_increment,
nomEnt varchar(50) default NULL,
listeActivites varchar(50) default NULL,
nbEmployes int(11) default NULL,
PRIMARY KEY (idEntreprise),
UNIQUE KEY idEntreprise (idEntreprise)
);

INSERT INTO Entreprises (idEntreprise, nomEnt, listeActivites, nbEmployes) VALUES
(1,'test','test', 5),
(2,'test2','test2', 15);

