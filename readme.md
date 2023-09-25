# Bruchrechner Java Edition

Es soll ein Bruchrechner entwickelt werden der genau zwei Brücke miteinander verrechnen kann.
Dabei ist es wichtig, dass alle vier Grundrechenarten: Addition, Subtraktion, Multiplikation und
Division von dem Bruchrechner unterstützt werden.
Definiert wird ein Bruch in folgender Schreibweise `Zähler/Nenner`.
Eine Aufgabe wird wie folgt definiert: `Zähler/Nenner Operant Zähler/Nenner`.
Der Operant ist dabei das mathematische Zeichen: `+`, `-`, `*` oder `/`.

Ihr sollt bei der Entwicklung auch folgende Fehlerfälle betrachten (siehe Beispiele):

- Es wird eine falsche Anzahl von Argumenten eingegeben
- Ein Bruch ist falsch definiert, also syntaktisch kaputt
- Es wurde ein nicht existierender Operant eingegeben

Die Entwicklung erfolgt mittels Objektorientierung.
Essenziell ist, dass das Programm über die gesamte Dauer nach Benutzereingaben fragt und
anschließend das Ergebnis ausgegeben wird.
Dies soll solange geschehen, bis der Benutzer das Wort `exit` in der Aufgabendefinition eingibt.

Wiederholung folgender Aspekte im Fokus:

1. Grundsätzliche Objektorientierung
2. Lösungsdesign nach Kundenanforderung
3. Exception-Handling für Ausnahmenbehandlung und gezielte Programmsteuerung
4. Einsatz von Softwarepatterns zur Codewartbarkeit

### Beispiele

```
1/2 + 1/4       =>  3/4
1/2 * 1/2       =>  1/4
1/2 / 1/4       =>  2/1
12/16 - 1/4     =>  1/2

1/2  + 1/4      =>  Es gab ein Problem mit Ihrer Rechnung: Die Anzahl der Parameter ist falsch
1,2 + 1/4       =>  Es gab ein Problem mit Ihrer Rechnung: Der Bruch wurde falsch definiert
1/2 + 1,4       =>  Es gab ein Problem mit Ihrer Rechnung: Der Bruch wurde falsch definiert
1/2 ? 1/4       =>  Es gab ein Problem mit Ihrer Rechnung: Der Operant konnte nicht ermittelt werden (+, -, *, /)
```