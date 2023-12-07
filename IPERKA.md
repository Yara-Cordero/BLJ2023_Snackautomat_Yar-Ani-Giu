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

<br>

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

<img width="400" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/abb51e11-ee49-47a2-99d8-8ccd00048a03">
<img width="400" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/fa8e2b3b-57ed-48e6-b5ed-060ff2f3f0f9">

<br><br>

Als wir uns dann für diesen Automaten entschieden, mussten wir uns überlegen wo wir das Geld anzeigen. Entweder wird es in einer seperaten Funktion geprinted oder gleich neben dem Automaten. Da es besser als neben dem Automaten aussieht entschieden wir uns für das.

<img width="700" src="https://github.com/Yara-Cordero/BLJ2023_Snackautomat_Yar-Ani-Giu/assets/145566014/98eb47e7-541a-4270-9365-faa3f5d79aa3">

Beim Realisieren hatten wir uns auch entschieden, dass wenn du den secret Key hattest, die Items restocken, den Name verändern und den Preis ändern konntest. 


# Realisieren

Das erste das wir beim Realisieren angingen war, dass wir unser GitHub Repo erstellten. Danach hatten wir die Repo auf 
unsere Laptops gecloned. 

Wir erstellten unsere verschieden Files.

- Main.java
(Hier wird nur die start Funktion aufgerufen)

- Machine.java 
(Hier werden alle Funktionen erstellt)
  - start();
  - secretKey();
  - purchaseItem();
  - printAutomat();
  - printAutomatWithPrice();
  - restock();
  - changePrice();

- Item.java
(Hier wurden die Attribute von unsere Items erfasst)
  - double price
  - String nameOfTheProduct
  - int amount

Wir fingen zu erst mit dem bearbeiten von unseren Automaten an, sodass dieser auch deine Geld Summe und den Preis und Name eines Gegenstandes printed. Wir färbten auch die verschiedenen Items ein um das Aussehen des Automates zu verschönern.
# Kontrollieren

# Auswerten
