# Informieren
Wir haben uns zuerst das Aufgabenblatt gründlich durchgelesen, um uns ein Bild von der gesamten Aufgabe machen zu können. Dann haben wir uns im Internet informiert was normalerweise in einem Snackautomaten enthalten ist und uns alle Sachen die uns in den Sinn gekommen sind aufgschrieben. Wir haben auch recherchiert welche Möglichkeiten wir hatten den Snackautomaten schön darzustellen, sodass es aber auch noch funktioniert.

## Tools 
- IntelliJ
- ChatGPT
- Google
- Github
- Github Desktop
- Hilfe von Berufsbildnern
- Teams für Kommunikation

# Planen
Wir haben uns aufgezeichnet wie unser Snack Automat aussehen soll und aufgeschrieben was für Funktionen enthalten sein müssen. Dann haben wir uns zwölf Items die wir zuvor aufgeschrieben haben ausgewählt, die wir gerne in unserem Automaten haben möchten. Wir haben auch noch Vier Items dazu ausgesucht die wir mit einem bereits bestehnedem Item ersetzen können und zwar mit dem sogenannten Secret Key.

Wir planten auch die Grösse unseres Automate und wie viele Items in den Snackautomaten passen würden. 

<img width ="200" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/8bc4f195-ddf7-4a93-8f0f-28270ce7c05f">
<img width ="200" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/bd5bde98-e76b-445b-86ed-af3f56fff263">
<img width="200" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/3afef066-e3de-4bab-a845-eeabb03aac01">
<img width="200" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/8b251528-2be7-456a-a6b9-faf853a2666f">

<br><br>
Um unser Vorhaben in die Tat umsetzen zu können, haben wir uns als Hilfestellung ein Activity Diagramm erstellt. Wobei wir hier einen kleinen Fehler gemacht haben und zwar das man kein Geld einwerfen kann und wenn zu wenig Geld vorhanden ist, dass das Geld nicht wieder zurückerstattet wird.

<img width="800" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/722557bb-85a5-412c-95cb-20852ffa2585">

<br><br>
Hier ist das verbessetrte Activity Diagramm. Es macht nur Sinn das der User entweder genug Geld hat oder nicht.

<img width="800" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/c06d93ed-f533-464b-85ef-c8fcdd857a15">

<br><br>
Wir haben uns hier eine Liste erstellt wo jedes Gruppenmitglied abhacken kann, was im File Machine schon erledigt ist, so dass alle aus der Gruppe auf dem neusten Stand sind, da alle Mitglieder mehrheitlich in diesem File arbeiten müssen.

<img width="600" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/6ba2a7ee-5393-4f65-8eca-aa46b0b74631">

<br><br>
Um uns das Fehler beheben einfacher zu machen, erstellten wir einen Loop in unsere Teams Gruppe, um dort umgehende Probleme aufzufassen.

<img width="500" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/207800cf-08f4-4fdb-9569-fe367c2f7d12">


# Entscheiden

Wir mussten viele Entscheidungen während dem Planen und Realisieren treffen. Beim Planen mussten wir uns zwischen verschiedenen ASCII Snackautomaten entscheiden und welches für unser Projekt besser passt. Wir haben und schlussendlich für die simplere Version entschieden, da wir die Reihen und Zeilen am besten gezeigt werden. 

<img width="400" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/fa8e2b3b-57ed-48e6-b5ed-060ff2f3f0f9">

<br><br>

Als wir uns dann für diesen Automaten entschieden, mussten wir uns überlegen wo wir das Geld anzeigen. Entweder wird es in einer seperaten Funktion geprinted oder gleich neben dem Automaten. Da es besser neben dem Automaten aussieht entschieden wir uns dafür.

<img width="700" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/98eb47e7-541a-4270-9365-faa3f5d79aa3">

Beim Realisieren hatten wir uns auch entschieden, dass wenn du den secret Key hattest, die Items restocken, austauschen und den Preis ändern konntest. 


# Realisieren

Das erste das wir beim Realisieren angingen war, dass wir unser GitHub Repo erstellten. Danach hatten wir die Repo auf 
unsere Laptops gecloned und erstellten unsere verschiedenen Files:

## Main.java
Hier wird nur die start Funktion aufgerufen in der alle Funktionen bereits zu einem Programm zusammenhefügt wurden. 

## Machine.java 
(Hier werden alle Funktionen erstellt)
Diese haben wir hier in der Dokumentation in zwei Teile unterteilt um das Verständnis zu vereinfachen. 

### start();
In der Start Funktion sind alle Funktionen zu einem Programm zusammengfrügt. Dabei haben wir zwischen den Basic Funktionen und den Secret Key unterschieden. die normalen Funktionen sind ohne den secret key zugänglich und sind dazu um Produkte zu kaufen und den Automat auszugeben. 
Auch haben wir hier einige Items definiert. Zu beginn hatten wir 16 verschiedene Produkte. Wir beschlossn uns jedoch dann einige extras hinzuzufügen um mehr 
Möglichkeiten beim austauschen der Produkte zu haben. 
Für den Benutzer ohne den Secret Key sind jedoch nur die Produkte käuflich die in der Maschine sind. 

#### purchaseItem();
Die Funktion hat damit begonnen das man nur gefragt wird ob man das Item kaufen will oder nicht. Die Frage welches Item eine Preisveränderung erhält wird schon in der secretKeyFunction(); bestimmt. Wenn du dich entscheidest das Item zu kaufen macht es einen Check ob du überhaupt genug Geld hast, wenn ja kannst du das Item kaufen und kommst wieder aus der Funktion raus. 

Die Funktion enthält auch eine Überprufüng ob der Input auch valide ist, wenn er jedoch nicht ist macht es einen Loop und su wirst nochmal gefragt.

<img width="500" alt="purchaseItemCode" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/2eb75602-29c1-4a8c-8781-15a56766c24f">

#### printAutomat();
Es gibt zwei Funktionen um den Automaten zu printen. Diese Funktion printet jedoch nur dein aktuellen Geldbetrag und die den Automaten ohne irgendwelche Infos zu den Items im Automaten selber. Der Geldbetrag wird auch jedesmal korrekt angezeigt und ist auch auf zwei Dezimal eingestellt um es autherntischer wirken zu lassen.

Die Items im Automaten sind haben alle Farben, um es mehr aus dem Automaten stechen zu lassen.

<img width="800" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/6990e86c-2342-4f6d-af7e-0fb170577c4f">

#### printAutomatWithPrice();
Bei dieser Version des print Automaten haben wir uns entschieden die Details unserer Produkte auf dem Bildschirm des Automaten anzuzeigen. Da die Länge der Namen der Items alle verschieden sind, verschiebte sich unsere ASCII Art ständig. Wir suchten im Internet nach Lösungen und fanden schlussendlich auf ChatGPT fündig. Es hat uns empfohlen bevor wir den Automaten printen, die Länge der Zeichen des Produkt Namen zu kontrollieren. Falls dieser so gross wie der Platz den wir für den Produkt Namen befüllt, macht es keine Veränderung, jedoch wenn dieser kürzer ist, gibt es dem Namen eine Art Padding auf beiden Seiten, so dass es denn Platz immernoch auffüllt. 

Es zeigt auch auf dem Bildschirm des Automaten, den Preis des Produktes.


<img wodth="300" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/ec53482f-b724-490f-b97e-d8c375445de6">

  
### secretKey();
#### restock();
Als wir begannen an der Restock Funktion zu arbeiten, haben wir uns dazu entschieden dass wir als Standard von allen Produkten 10 Stücke haben. In der Restock Funktion kann man dann entscheiden ob man das Produkt wieder auf 10 auffüllt oder für besonders beliebte Produkte kann man die Anzahl auch auf das Maximum von 15 setzen. 

Wir haben es auch so gemacht dass es die fehlenden Anzahl Stücke berechnet und nur diese dann dazufügt. Wir haben uns dazu entschieden da es ja ein Automat ist und mann beim Auffüllen nicht alle Artikel ersetzen will sondern nur auffüllen möchte. 
Beim auffüllen auf 10 überprüft das Programm ebenfalls ob schon 10 Stücke vorhanden sind oder nicht. 

<img width="500" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566901/595be87f-739e-4920-8fb7-11915dc37695">


#### changePrice();

Bei der Funktion "change price" kann der User von einem beliebigen Produkt, dass im Automaten enthalten ist der Preis ändern. Nachdem der User den neuen Preis eingegeben hat zeigt es in der Konsole an, was der neue Preis des Produkts ist. Wir haben hier mit den Positionsnamen (A1) der Produkte gearbeitet die am Automaten angeschrieben sind  und nicht mit den Produknamen (Maltesers) selber.

<img width = "500" alt= "image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/93292a09-ec7d-4000-af7e-36717dfb4117">

#### replaceItem();
Da wir bei der Replace Item Funktion hatten das Item zu addressieren entschieden wir uns dazu die Produkte nach Position zu benennen. Somit konnten wir einfach die Daten miteinander wechseln mit einer Temporärer Variable um keiner der Items zu verlieren. 

<img width="500" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566901/ef0b0dc1-f59b-468a-975c-abb070ab05d7">

## Item.java
Hier haben wir die 
(Hier wurden die Attribute von unsere Items erfasst)
  - double price
  - String nameOfTheProduct
  - int amount



Wir fingen zu erst mit dem bearbeiten von unseren Automaten an, sodass dieser auch eine Geld Summe und den Preis und Name eines Gegenstandes printed. Wir färbten auch die verschiedenen Items ein um das Aussehen des Automates zu verschönern.


# Kontrollieren

Wir haben unser Code mehr oder weniger fertiggestellt und kontrolliert, wobei uns ein paar Fehler aufgefallen sind die wir noch beheben müssen. Was noch ein Problem ist, ist das wenn man ein Objekt kauft und dann nochmals eins Kaufen möchte dies noch nicht so ganz funktioniert wie wir uns das vorgestellt haben. Ein weiters noch bestehendes Problem ist der secret key. Es funktionieren noch nicht alle funktionen im secret key wie sie Funktionieren sollten. Es gibt aber auch noch sehr kleine Probleme die im Code noch behoben werden müssen.
Die Funktionen die im Secret Key beinhaltet sind sollten funktionieren jedoch gibt es ein Fehler bei der Funktion selbst die sie alle zu einem Programm macht. 

<img width="1000" alt="image" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145564994/56c9566d-4208-4570-bf5a-2851c8c0fa07">


## Bugs
- SecretKey Function
- Wiederholung der Kauffunktion 
- Zweimal Enter drücken nach einer Eingabe

# Auswerten

#### Anik
Alles in allem ist uns dieses Projekt ziemlich gut gelungen. Wir haben ein Funktionierendes End-Resultat mit den Features, die wir von Anfang an drin haben wollten. Unsere Zusammenarbeit war sehr harmonisch wir haben uns gegenseitig geholfen und uns immer ausgetauscht. Am Anfang war Giulia krank und dessahlb mussten Yara und ich den Anfang des Projekts alleine machen und Planen. ALs Giulia dann wieder gesund war haben wir, ihr unsere Ideen und Gedankengänge erklärt und den Code, den wir bis da hatten gezeigt. Wir haben die noch übrigen Features aufgeteilt, so dass jeder noch etwas zu coden hat. Was auch noch sehr gut funktioniert hat, sind die zuverlässigen und regelmässigen commits und updates des Codes.


#### Yara
Meiner Meinung nach ging das Projekt wie wir uns es vorgestellt hatten. Leider war am Anfang des Projektes Giulia noch krank, und konnte nicht mit uns planen. Jedoch fand ich das wir sie immernoch gut in das Projekt integrieren konnten. Unsere Planung half uns beim Projekt sehr, da wir konkrete Erwartungen hatten und wussten was es alles brauchte um diese zu erfüllen. Manchmal hatten wir paar Hiccups und mussten uns zusammen tun, um Lösungen dazu zu finden. Ich fand das an unserem Projekt besonders gut, weil wir nie ganz alleine am Projekt arbeiteten. Rest des Projektes hatten wir manchmal vergessen die Veränderunge zu fetchen, und mussten unsere Variation des Codes seperat Kopieren und danach einsetzten und dann Commiten und Pushen.


#### Giulia
Da ich krank war hatte ich zuerst Mühe in das Projekt herein zu kommen. Jedoch verstand ich das meiste nachdem ich den Code studierte und Yara und Anik mir noch einige Sachen erklärten. 
Was ich sehr gut fand war die Kommunikation. Wir besprachen alles miteinander und informierten einander auch immer wer in welchem File arbeitete um Merge Konflikte möglichst gut zu vermeiden. Es gab einige Sachen die ich anderst implementiert hätte jedoch war es ein gutes Projekt und auch wenn es noch einige Bugs gibt denke ich dass wir alle zufrieden mit dem Produkt sind. 

