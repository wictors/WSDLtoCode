# 2. Od WSDL ku Kódu
Projekt bol vytvorený v Eclipse IDE for Java Developers // Version: Oxygen.2 Release (4.7.2) Použitá JAVA verzia: jdk1.8.0_151 Pre náhľad WSDL bol použitý prehliadač Chrome.

Po stiahnutí projektu do IDE, sa serverovská časť spúšta cez triedu Server.java, ktorá sa nachádza v balíčku sk.kopr.server. Klientská časť sa spúšťa cez triedu Klient.java, ktorý sa nachádza v balíčku sk.kopr.klient.

JUNIT testy na otestovanie serverovskej časti sa nachádzajú v balíčku sk.kopr.server pod názvom DaoTest.java. Klientska časť sa otestuje priamo pri spustení hlavného súboru Klient.java v balíčku sk.kopr.klient. Je tam vytvorený jeden request a resposne, ktorý vypíše do konzoly UUID. Vytvorený študent následne ostáva v DB. Môže sa ručne zmazať alebo nemusí.

Projekt využíva SQL databázu. Pre zostavenie databázy využite príkazy v priloženom súbore sql.sql. Vytvorí novú schému s tabuľkami a používateľa na prístup do schémy. Údaje na otestovanie nie sú potrebné.

Vytvorenie databázy stačí vykonať raz. Prvý aj druhý projekt využívajú rovnakú databázu aj prístupového klienta.
