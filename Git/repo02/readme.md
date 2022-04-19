# Ejercicio 2
### 2.1.
- Para empezar creamos un repositorio vacío en _GitHub_.
- A continuación lo clonamos utilizando el comando **git clone**.
### 2.2.
- Creamos este fichero y realizamos un _commit_.
### 2.3.
- Creamos una tabla con los distintos comandos de _Git_ utilizados.  

**Comando**|Función|**Comando**|Función
:-|:-:|:-|:-:
**init**|Genera una carpeta oculta _.git_|**branch -M main**|Define la rama principal
**status**|Devuelve el estado de los archivos del repositorio|**push -u origin _branch name_**|Publica el contenido comprobando que existe una _tracking connection_ entre la rama local y la remota.
**add .**|Añade todos los ficheros del repositorio a la _staging area_|**push**|Publica el contenido
**add _file_**|Añade el fichero especificado a la _staging area_|**pull**|Descarga e integra los cambios remotos en el repositorio local
**commit**|Captura una _Snapshoot_|**clone**|Clona un repositorio remoto
**remote add origin _link_**|Enlaza el repositorio local con el remoto|**remote -v**|Devuelve el repositorio remoto enlazado al repositorio actual