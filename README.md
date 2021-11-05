# Imagen_a_texto
Este programa es un tipo OCR ya que permite sacar los textos de la imagen y permite guardarlos en un fichero txt. (por cuestiones de espacio solo se subio el archivo SPA)

<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/eng.JPG" width="650" >
</br>
<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/spa.JPG" width="650" >
<br/>
<p>Esto se agrego esto al archivo POM ya que al generar el jar este no contenia las dependecias lo coloco aqui </p>
<p>por si alguien tiene el mismo problema solo debe cambiarse  "<mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass>"</p>
<p>por la ruta y el nombre del archivo main del proyecto en uso estas lienas van despues de  < /dependencies></p>
<br/> 
<p>< build>
<p>< plugins>           
   <p>        < plugin>
      <p>          < groupId>org.apache.maven.plugins</groupId>
         <p>       < artifactId>maven-eclipse-plugin</artifactId>
            <p>    < version>2.9</version>
               <p> < configuration>
                  <p>  < downloadSources>true</downloadSources>
                    <p>< downloadJavadocs>false</downloadJavadocs>
            <p>    < /configuration>
        <p>    < /plugin>           
         <p>   < plugin>
         <p>       < groupId>org.apache.maven.plugins</groupId>
         <p>       < artifactId>maven-compiler-plugin</artifactId>
        <p>        < version>2.3.2</version>
        <p>        < configuration>              
         <p>           < source>1.8</source>
         <p>           < target>1.8</target>
        <p>        < /configuration>
        <p>    < /plugin>             
        <p>    < plugin>                
        <p>        < groupId>org.apache.maven.plugins</groupId>
        <p>        < artifactId>maven-assembly-plugin</artifactId>
        <p>        < version>2.4.1</version>
         <p>       < configuration>        
         <p>            //---Esto es necesario para construir nuestro jar junto con las librerias    
          <p>          < descriptorRefs>
         <p>               <descriptorRef>jar-with-dependencies</descriptorRef>
          <p>          < /descriptorRefs>           
         <p>           < archive>
         <p>               < manifest>
         <p>                   < mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass>
          <p>              < /manifest>
         <p>           < /archive>
        <p>        < /configuration>
        <p>        < executions>
         <p>           < execution>
        <p>                < id>make-assembly</id>
         <p>               < phase>package</phase> 
         <p>               < goals>
         <p>                   < goal>single</goal>
          <p>              < /goals>
         <p>           < /execution>
          <p>      < /executions>                 
         <p>   < /plugin>                  
     <p>   < /plugins>
    <p>< /build>
