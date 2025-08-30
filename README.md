[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/_8NEdSwV)
# ISP — Dispositivos (testes falham inicialmente)

`OfficeService.printReport()` chama `scan()` desnecessariamente. `SimplePrinter` não suporta e lança `UnsupportedOperationException`.  
O teste espera **não** lançar. Inicialmente, falha.

## Tarefa
- Segregar interfaces (`Printer`, `Scanner`) e garantir que `printReport` use **apenas** `Printer`.

## Rodar
```bash
mvn -q test
```
