# 🧮 OrdenarNumeros

Este proyecto es la **segunda parte** del sistema: recibe una secuencia de números generados por la parte de “Aleatorios” y los ordena, devolviendo un archivo o salida ordenada.

---

## 📦 Estructura del proyecto

```
OrdenarNumeros/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── OrdenarNumeros/
                ├── Main.java
                └── (otras clases de ordenación)
```

- `pom.xml` — configuración de Maven  
- `Main.java` — punto de entrada principal  
- Clases auxiliares para diferentes algoritmos de ordenación.

---

## 🎯 Objetivo

1. Ser la **segunda parte** del sistema completo: recibe números aleatorios ya generados, sean por consola, fichero o argumentos.  
2. Aplicar un algoritmo de ordenación eficiente para devolver la secuencia ordenada.  
3. Empaquetar todo en un **.jar ejecutable** con Maven, de modo que se pueda invocar simplemente con:
   ```bash
   java -jar ordenar-numeros.jar [opciones]
   ```

---

## 🛠 Uso con Maven

Para construir el proyecto y generar el `.jar`:

```bash
mvn clean package
```

Esto generará un artefacto `.jar` en la carpeta `target/`, por ejemplo `OrdenarNumeros-1.0-SNAPSHOT.jar`.

Puedes ejecutar el JAR así:

```bash
java -jar target/OrdenarNumeros-1.0-SNAPSHOT.jar <entrada>
```

Dónde `<entrada>` puede ser:
- nombre de archivo con números a ordenar  
- secuencia de números separados por espacios  
- otros modo que definas (stdin, etc.)

---

## 🔄 Integración con la parte “Aleatorios”

Puedes usar el `.jar` generado de esta parte para procesar la salida del generador de números aleatorios (parte 2). Por ejemplo:

```bash
java -jar Aleatorios-1.0-SNAPSHOT.jar --count 100 | java -jar OrdenarNumeros-1.0-SNAPSHOT.jar
```

De este modo, generas 100 números aleatorios y los pasas directamente al módulo de ordenación.

---

## 📋 Configuración adicional / mejoras

- Añadir opciones de línea de comandos (por ejemplo, tipo de algoritmo, orden ascendente/descendente)  
- Manejo de ficheros de entrada/salida  
- Validaciones de datos  
- Documentación de los algoritmos usados  
- Pruebas unitarias  

---

## 📝 Licencia / Contribución

Ángel Japón Castañeda

---

## ✅ Checklist final

- [ ] Construir con `mvn clean package`  
- [ ] Generar el `.jar` ejecutable  
- [ ] Probar el `.jar` con diferentes entradas  
- [ ] Integrarlo con el módulo de generación  
