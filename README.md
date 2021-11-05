# Imagen_a_texto
Este programa es un tipo OCR ya que permite sacar los textos de la imagen y permite guardarlos en un fichero txt. (por cuestiones de espacio solo se subio el archivo SPA)

<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/eng.JPG" width="650" >
</br>
<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/spa.JPG" width="650" >
<br/>
<p>Esto se agrego al archivo POM ya que al generar el jar este no contenia las dependecias lo coloco aqui </p>
<p>por si alguien tiene el mismo problema solo debe cambiarse  "<mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass>"</p>
<p>por la ruta y el nombre del archivo main</p>
<br/> 
 <p>   <plugins>  </p>         
         <p>   <plugin></p>
           <p>     <groupId>org.apache.maven.plugins</groupId></p>
           <p>     <artifactId>maven-eclipse-plugin</artifactId></p>
            <p>    <version>2.9</version></p>
            <p>    <configuration></p>
           <p>         <downloadSources>true</downloadSources></p>
           <p>         <downloadJavadocs>false</downloadJavadocs></p>
           <p>     </configuration></p>
           <p> </plugin>           </p>
          <p>  <plugin></p>
          <p>      <groupId>org.apache.maven.plugins</groupId></p>
          <p>      <artifactId>maven-compiler-plugin</artifactId></p>
           <p>     <version>2.3.2</version></p>
           <p>     <configuration>       </p>       
           <p>         <source>1.8</source></p>
           <p>         <target>1.8</target></p>
           <p>     </configuration></p>
          <p>  </plugin>           </p>  
          <p>  <plugin>           </p>     
              <p>  <groupId>org.apache.maven.plugins</groupId></p>
              <p>  <artifactId>maven-assembly-plugin</artifactId></p>
              <p>  <version>2.4.1</version></p>
               <p> <configuration>      </p>  
               <p>      //---Esto es necesario para construir nuestro jar junto con las librerias    </p>
                 <p>   <descriptorRefs></p>
                 <p>       <descriptorRef>jar-with-dependencies</descriptorRef></p>
                 <p>   </descriptorRefs>           </p>
                <p>    <archive></p>
                 <p>       <manifest></p>
                 <p>           <mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass></p>
                <p>        </manifest></p>
               <p>     </archive></p>
              <p>  </configuration></p>
             <p>   <executions></p>
                 <p>   <execution></p>
                  <p>      <id>make-assembly</id></p>
                  <p>      <phase>package</phase> </p>
                  <p>      <goals></p>
                   <p>         <goal>single</goal></p>
                   <p>     </goals></p>
                 <p>   </execution></p>
               <p> </executions>       </p>          
            <p></plugin>          </p>        
        <p></plugins></p>
<br/> 
