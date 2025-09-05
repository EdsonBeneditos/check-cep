

## PT-BR
# 📦 Consulta de CEP com ViaCEP (Java + Orientação a Objetos)

Este é um projeto básico em Java que realiza a busca de endereços a partir de um CEP, utilizando a **API pública ViaCEP**. O sistema foi desenvolvido com foco em **prática de orientação a objetos (POO)** e boas práticas de programação.

---

## 🧠 Objetivo

Exercitar os principais conceitos de **orientação a objetos** na linguagem Java, criando um programa capaz de:

- Buscar informações de um endereço a partir de um CEP informado pelo usuário
- Exibir dados como: logradouro, complemento, bairro, localidade, UF, DDD, entre outros
- Integrar com uma API externa (ViaCEP) de forma simples e funcional

---

## 🛠️ Tecnologias e Ferramentas

- **Java** (versão 21) 
- **API ViaCEP** (gratuita e pública): https://viacep.com.br
- IDE: IntelliJ IDEA
- Biblioteca padrão do Java para HTTP ou [HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html)
- [Gson](https://github.com/google/gson) 

---

## 🧱 Estrutura Orientada a Objetos

O projeto foi desenvolvido aplicando conceitos de **POO**:

- **Classe `Address`**  
  Representa os dados de um endereço retornado pela API. Contém atributos como:
    - `cep`, `logradouro`, `bairro`, `localidade`, `uf`, `ddd`, etc.

- **Classe `CheckCep`**  
  Responsável por fazer a chamada HTTP à API ViaCEP e tratar a resposta.

- **Classe `Main` (ou `App`)**  
  Classe principal que recebe o CEP do usuário e inicia a busca.

---

## 🚀 Como Executar

1. Clone o repositório:

`git clone https://github.com/EdsonBeneditos/check-cep.git`

## **✅ Funcionalidades**

 - Buscar endereço por CEP

 - Tratar erros de CEP inválido

 - Utilizar orientação a objetos

 - Consumir API externa com Java puro

 - Exibir dados formatados no terminal

## **📚 Conceitos Aplicados**

- Programação orientada a objetos (POO)

- Consumo de APIs REST

- Manipulação de JSON

- Boas práticas em Java (encapsulamento, separação de responsabilidades)

- Tratamento de exceções

## US - ENGLISH

# 📦 ZIP Code Lookup with ViaCEP (Java + Object-Oriented Programming)

This is a basic Java project that performs address lookup based on a ZIP code (CEP), using the **public ViaCEP API**. The system was developed with a focus on **object-oriented programming (OOP)** practice and clean coding principles.

---

## 🧠 Objective

To practice the main concepts of **object-oriented programming** in Java by creating a program capable of:

- Retrieving address information from a ZIP code entered by the user
- Displaying data such as: street, complement, neighborhood, city, state (UF), area code (DDD), among others
- Integrating with an external API (ViaCEP) in a simple and functional way

---

## 🛠️ Technologies and Tools

- **Java** (version 21)
- **ViaCEP API** (free and public): https://viacep.com.br
- IDE: IntelliJ IDEA
- Java standard HTTP library or [HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html)
- [Gson](https://github.com/google/gson)

---

## 🧱 Object-Oriented Structure

The project was developed using **OOP** concepts:

- **Class `Address`**  
  Represents the address data returned by the API. It contains attributes such as:
  - `cep`, `logradouro`, `bairro`, `localidade`, `uf`, `ddd`, etc.

- **Class `CheckCep`**  
  Responsible for making the HTTP request to the ViaCEP API and handling the response.

- **Class `Main` (or `App`)**  
  Main class that receives the ZIP code input from the user and starts the search.

---

## 🚀 How to Run

1. Clone the repository:


`git clone https://github.com/EdsonBeneditos/check-cep.git`

## ✅ Features

- Search for address by ZIP code
- Handle invalid ZIP code errors
- Use object-oriented programming
- Consume external API using pure Java
- Display formatted data in the terminal

## 📚 Key Concepts Applied

- Object-oriented programming (OOP)
- REST API consumption
- JSON manipulation
- Java best practices (encapsulation, separation of concerns)
- Exception handling



## **🤝 Contato**

Desenvolvido por Edson Benedito da Silva
📧 Email: edsonbe.silva@outlook.com

🔗 LinkedIn: https://www.linkedin.com/in/edson-benedito-da-silva-163957183/
