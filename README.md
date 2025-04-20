# 🍽️ Simulazione di Chef e Cucina - Java Multithreading

Questo progetto è una semplice simulazione in Java di più chef che accedono a una cucina condivisa utilizzando il multithreading. Ogni chef rappresenta un thread che tenta di utilizzare risorse limitate come piatti, posate e dessert.

## 📚 Obiettivi del progetto

- Applicare i concetti di **thread** in Java
- Gestire risorse condivise con **synchronization**
- Simulare accessi concorrenti in un ambiente realistico
- Comprendere le problematiche di **race condition** e **accesso critico**

---

## 🧱 Struttura del progetto

| File         | Descrizione |
|--------------|-------------|
| `Chef.java`  | Rappresenta uno chef che agisce come thread. Ogni chef tenta di accedere alla cucina in modo sincronizzato. |
| `Cucina.java`| Gestisce le risorse condivise (piatti, posate, dessert) e il loro consumo casuale. |
| `Thread1.java`| Classe `main` che istanzia più chef e avvia i loro thread. |

---

## 🧪 Esecuzione

### Requisiti:
- JDK 8 o superiore
- IDE (es. NetBeans, IntelliJ, VS Code) o terminale con `javac`

### Compilazione:
```bash
javac com/mycompany/thread1/*.java
