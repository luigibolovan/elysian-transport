## Mini aplicatie simplificata de calcul al costului pentru transportul unei cantitati de marfa intre A si B.

Actorii principali sunt urmatorii :

**Userul** : el interactioneaza cu aplicatia ( in mod text sau grafic, cum preferi).
El spune cat are de transportat si ce prioritate are la transport(are de ales intre foarte urgent, urgent, normal, ieftin).

**Brokerul de transport**: el culege informatia de la user si apoi decide, pe baza unui algoritm care este cea mai potrivita posibilitate de transport ( cu masina, cu avionul, cu elicopterul, cu vaporul, cutrenul, cu tirul)

Regulile de transport sunt urmatoarele :
- 1 palet : masina, avion, elicopter
- 2-50 paleti : tren, tir
- `>` 50 paleti vapor


Viteza de transport e urmatoarea(la fel si costurile de transport,ordonate de la scump la ieftin)
- elicopter
- avion
- masina
- tir
- tren
- vapor

Poti stabili care e pretul unui palet pt fiecare modalitate de transport.
La final aplicatia(brokerul) spune userului cat va costa transportul si cu ce va fi efectuat.
