# CBTLPR1-Java-TP03

# 🕒 TP03 - Classe Hora (Java)

## 📌 Sobre o Projeto

Trabalho feito em dupla ( Gustavo Murai e Igor Murai)

Este é o Trabalho Prático 03 da disciplina de **Linguagem de Programação 1 (Java)** do curso de Análise e Desenvolvimento de Sistemas – IFSP Campus Cubatão.

O objetivo do projeto é criar uma **classe Java chamada `Hora`** que simula um relógio, permitindo manipular e exibir o tempo em diferentes formatos, além de testar todos os seus métodos em uma classe separada chamada `TestaHora`.

---

## 🚀 Funcionalidades da Classe `Hora`

A classe `Hora` é responsável por armazenar, validar e manipular informações de tempo (hora, minuto e segundo), além de:

- ✅ Construtor com entrada via teclado
- ✅ Construtor com parâmetros (`int h, int m, int s`)
- ✅ Métodos `set` e `get` com e sem entrada via teclado
- ✅ Formatação da hora em:
  - Formato 24h: `HH:mm:ss`
  - Formato 12h com AM/PM
- ✅ Cálculo da hora em **segundos totais**
- ✅ Validação e tratamento de erros na entrada de dados

---

## 🧪 Testes com a Classe `TestaHora`

A classe `TestaHora` realiza testes para validar todas as funcionalidades da classe `Hora`, como:

- Criação de objetos com ambos os construtores
- Alteração de hora, minuto e segundo
- Entrada de dados pelo teclado
- Impressão da hora em diferentes formatos
- Cálculo de segundos
