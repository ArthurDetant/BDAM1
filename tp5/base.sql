CREATE TABLE `entreprises` ( 
 `idEntreprise` int(10) NOT NULL auto_increment, 
 `nomEnt` varchar(50) default NULL, 
 `listeActivites` varchar(150) default NULL,
 `nbEmployes` int(10) NOT NULL,
 PRIMARY KEY (`idEntreprise`), 
 UNIQUE KEY `idEntreprise` (`idEntreprise`) 
) ENGINE=InnoDB;



CREATE TABLE `groupes` ( 
 `idgroupe` int(4) NOT NULL auto_increment, 
 `nomgroupe` varchar(50) default NULL, 
 `commentairegroupe` varchar(150) default NULL, 
 PRIMARY KEY (`idgroupe`), 
 UNIQUE KEY `idgroupe` (`idgroupe`) 
) ENGINE=InnoDB; 


INSERT INTO `entreprises` (`idEntreprise`, `nomEnt`, `listeActivites`, `nbEmployes`) VALUES  
  (1,'OUI','informatique', 5), 
  (2,'NONbus','train', 899);
