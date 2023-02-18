## Compilar el proyecto

mvn clean package

## Ejecutar proyecto

mvn spring-boot:run


##Peticion GET resolver, 
## Recibe idprestamo y iteraciones como params

## Servicio Resolver
curl --location --request GET 'http://localhost:8887/resolver/datos?idprestamo=5&iteraciones=7' \
--header 'Content-Type: application/ecmascript'


##Respuesta

{
	"mensaje":"10,9,15,7,11"
}