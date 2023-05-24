# CASO LABORATORIO 2 
**Consideraciones generales:**
* **Se considerará el orden, la claridad de las respuestas y las buenas prácticas**.


* Las preguntas deben resolverse de acuerdo con los conceptos discutidos o analizados en clase. Para ello, aplicará su propio criterio para dar una solución a los problemas planteados.


* Para el desarrollo de la siguiente aplicación utilice los archivos proporcionados por el docente y cree el proyecto MAVEN con el nombre **DAWI_CL2_XXXX** (donde XXXX serán sus apellidos y nombres) cree la estructura de carpetas necesarias

|LOGRO DE LA EVALUACIÓN: |
| ------------------------| 
|Al término de la evaluación, el alumno implementa proceso de registro y listado de una tabla empleando JPA, realizando un correcto mapeado y una vista para su funcionalidad. | 

---
# PROBLEMA
Usted como desarrollador se le asignado la funcionalidad de **mantenimiento de Libros**, para ello se tiene el siguiente prototipo y modelo de datos:
   ![Mantenimiento de Libros](/public/mantenimiento-libros.png)
             
   ![Base de Datos](/public/database-libros.png)
---
## PREGUNTA 1
* Realiza el proyecto Maven **DAWI_CL2_XXX** con los archivos necesarios en el archivo pom.xml para el desarrollo


* Mediante el uso de versiones con git **creando por lo menos 2 commit**, al iniciar y al finalizar, agrega la información necesaria.


* Cree en MySQL la base de datos **CL2_XXX**. Dicha base de datos contiene la tabla **libro** compuesta de los 6 campos indicados en el apartado anterior, se cuenta además con la tabla **tema** que servirá para generar un combo, el cual cuenta con 2 campos y está relacionada con la tabla libro. 


* Mediante JPA y Hibernate, se debe desarrollar las operaciones necesarias para completar el registro, carga de combo Tema y listado de Libros.

* Ingrese 3 registros de prueba (en consola) en cada tabla y guarde el resultado como archivo de texto en su proyecto (Archivo se debe llamar: “CL2_XXX.txt”.
---
## PREGUNTA 2 - 3
Diseñe la GUI **mantenimiento[apellido]** de escritorio que permita **ingresar** los datos de los Libros y realiza la validación de los campos al pulsar el botón **registrar**. considerando:

* **Validar campos de texto** con sólo caracteres alfabéticos hasta el tamaño respectivo.

* **Validar campos numéricos enteros** o con 2 decimales según corresponda.

* **Mostrar un mensaje de registro** exitoso o error según corresponda.

* Para el ingreso del Tema, se debe mostrar mediante un combo que se obtiene con los datos de la tabla área.
---
## PREGUNTA 4
Dentro del GUI de la pregunta anterior, agregar una tabla que permita mostrar los datos del libro y su **descripción del tema**, dicho listado debe estar ordenado.
