# Ejercicio 1 Git
### **1.1.**
- Para empezar creamos la carpeta repo01 en nuestro PC mediante bash con el comando **mkdir repo01**
- A continuación nos dirigimos a dicha carpeta mediante bash con el comando cd **repo01/** y, una vez dentro, ejecutamos el comando **git init**, al hacer esto podremos observar que se ha creado una carpeta oculta _.git_.
### **1.2**
- Importamos el repositorio a **_Visual Studio Code_** arrastando la carpeta al explorador de archivos.
- Creamos el fichero llamado _readme.md_ que nos servirá para documentar los pasos del ejercicio.
- Para comprobar en que estado se encuentra el documento _readme.md_ ejecutamos el comando **git status** y observamos que que se encuentra en la categoría _"Untracked files"_.  
![Primera captura: Untracked Files](https://github.com/MelAubets/repo01/blob/main/Imagenes/Pas1Ex1.png?raw=true "Primera captura: Untracked Files")
### **1.3**
- Utilizamos el comando **git add readme.md** para añadir el fichero a la _staging area_.
- Tras realizar el paso anterio-r podemos volver a ejecutar el comando **git status** para comprobar que el fichero aparece como _"Changes to be committed"_.  
![Segunda captura: Changes to be committed](https://github.com/MelAubets/repo01/blob/main/Imagenes/Pas2Ex1.png?raw=true "Segunda captura: Changes to be committed")
- Utilizamos el comando **git commit -m "Creation of readme.md file"**
- Al realizar de nuevo la consulta del estado con **git status** podremos observar que nos dice _"nothing to commit"_.  
![Tercera captura: Nothing to commit](https://github.com/MelAubets/repo01/blob/main/Imagenes/Pas3Ex1.png?raw=true "Tercera captura: Nothing to commit")
### **1.4**
- Creamos un repositorio remoto con el mismo nombre desde _GitHub_ pulsando en **_New_** desde el apartado **_Repositories_**
- Si usamos el comando **git remote -v** podremos observar que no nos devuelve nada, esto es debido a que todavía no hemos asociado nuestro repositorio local al repositorio remoto.
- A continuación ejecutamos los comandos siguentes:  
**git remote add origin https://github.com/MelAubets/repo01.git  
git branch -M main  
git push -u origin main**
- Si ahora utilizamos el comando **git remote -v** observaremos que nos responde  
_origin  https://github.com/MelAubets/repo01.git (fetch)_  
_origin  https://github.com/MelAubets/repo01.git (push)_  
indicando que la asociación de ha hecho correctamente.  
![Cuarta captura: git remote -v](https://github.com/MelAubets/repo01/blob/main/Imagenes/Pas4Ex1.png?raw=true "Cuarta captura: Nothing to commit")
- Al entrar en el repositorio remoto desde _GitHub_ podremos ver que se ha subido el fichero _readme.md_, aunque también podremos observar que se ha subido solo hasta el punto en el que hemos hecho la _snapshoot_.
### **1.5.**
- Volvemos a realizar los pasos descritos en el apartado **1.3** junto con el comando **git push -u origin main** para que el fichero _readme.md_ esté actualizado.
### **1.6**
- Para poder añadir las capturas de pantalla que hemos ido realizando en nuestro archivo readme.md creamos una carpeta llamada "Imagenes" en nuestro repositorio y seguimos los pasos anteriores para subirlas a GitHub.
- Para terminar listamos los _committs_ realizados durante el ejercicio en este mismo fichero utilizando el comando **git log** y volvemos a realizar los pasos del apartado **1.3.**

## Listado de commits
***
De más reciente a más antiguo tenemos:  

```
Commit b5da33f10058a211c122cd55e81cf3bbd72e9dbc (HEAD -> main, origin/main)
Author: Mel Aubets Serra <emilystrange93@gmail.com>
Date:   Sun Mar 27 21:37:26 2022 +0200  

    Upload Imagenes folder
```
```
Commit a2995e9ac7329647be2f1be5ac0d8aaf198eaa8d
Author: Mel Aubets Serra <emilystrange93@gmail.com>
Date:   Sun Mar 27 21:31:08 2022 +0200

     readme.md file update
```
```
commit 36c1e4ad87a61c5dbffa1749a9a76402b705ac00
Author: Mel Aubets Serra <emilystrange93@gmail.com>
Date:   Sun Mar 27 20:08:49 2022 +0200

    Creation of readme.md file
```
