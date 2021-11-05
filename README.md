# Imagen_a_texto
Este programa es un tipo OCR ya que permite sacar los textos de la imagen y permite guardarlos en un fichero txt. (por cuestiones de espacio solo se subio el archivo SPA)

<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/Imagen_texto_java/happy.jpg" width="650" >
</br>
<img src="https://github.com/ringostarr-jaime/Imagen_a_texto/blob/main/Imagen_texto_java/sometimes.jpg" width="650" >
<br/>
Esto se agrego al archivo POM ya que al generar el jar este no contenia las dependecias lo coloco aqui 
por si alguien tiene el mismo problema solo debe cambiarse  "<mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass>"
por la ruta y el nombre del archivo main
<br/> 
    <plugins>           
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-eclipse-plugin</artifactId>
                <version>2.9</version>
                <configuration>
                    <downloadSources>true</downloadSources>
                    <downloadJavadocs>false</downloadJavadocs>
                </configuration>
            </plugin>           
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.3.2</version>
                <configuration>              
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>             
            <plugin>                
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-assembly-plugin</artifactId>
                <version>2.4.1</version>
                <configuration>        
                     //---Esto es necesario para construir nuestro jar junto con las librerias    
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>           
                    <archive>
                        <manifest>
                            <mainClass>com.jaime.imagen_texto_java.Gestionarchivos</mainClass>
                        </manifest>
                    </archive>
                </configuration>
                <executions>
                    <execution>
                        <id>make-assembly</id>
                        <phase>package</phase> 
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>                 
            </plugin>                  
        </plugins>

