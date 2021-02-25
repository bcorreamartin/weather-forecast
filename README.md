# Presentación

Hola!
Soy Borja Correa Martín, tengo 29 años y tengo 2 años y medio de experiencia como desarrollador de aplicaciones web.


# Preguntas y respuestas

- ¿Qué has empezado implementando y por qué?
    
    Lo primero que he hecho es descomponer el código para separar y conocer las partes de este y he pasado a crear los tests para las llamadas a la api.
            
- ¿Qué problemas te has encontrado al implementar los tests y cómo los has solventado?
    
    El mayor problema creo que ha sido intentar hacerlo rápido y dejarme algún test por el camino que he tenido que realizar más tarde.
    Problemas cómo no poder acceder a métodos privados o la integridad de los datos.

- ¿Qué componentes has creado y por qué?
    
    Los componentes que he creado són: 
        - MetaWeatherUtils
            Clase Utils para tratar los resultados que me están devolviendo las peticiones de MetaWeather y ajustarlas a como quiero recibirlas.
        - MetaWeatherClient
            Clase dedicada única y exclusivamente a hacer/recibir peticiones a la api de MetaWeather.
        - DateUtilTest
            Clase dedicada exclusivamente a tratar/comprobar datos de fechas.
        - WeatherForecast
            Lo he tratado como servicio.
        - Application
            He creado una clase Application con un main para poder ejecutar la prueba junto con ApplicationTest donde se llaman a todos los Tests.
            
- Si has utilizado dependencias externas, ¿por qué has escogido esas dependencias?
    
    No he usado más dependencias de las que traía el proyecto.
    
- ¿Has utilizado  streams, lambdas y optionals de Java 8? ¿Qué te parece la programación funcional?
    
    He utilizado Stream y Lambda por que yo trabajo con Java 7, no las había utilizado nunca y tenía curiosidad por ver cómo funcionaban.
    
    La programación funcional me da la impresión de que agiliza el tiempo del desarrollo con un Código más preciso, corto y con alta mantenibilidad.
    
- ¿Qué piensas del rendimiento de la aplicación? 
    
    Seguramente el rendimiento podría mejorar. 
    
- ¿Qué harías para mejorar el rendimiento si esta aplicación fuera a recibir al menos 100 peticiones por segundo?
    
    Podría utilizar herramientas tipo Profiler para obtener información detallada de cada parte del código 

- ¿Cuánto tiempo has invertido para implementar la solución?
    
    He invertido 5 horas
 
- ¿Crees que en un escenario real valdría la pena dedicar tiempo a realizar esta refactorización?
    
    Si, creo que sólo con el beneficio de mantenibiildad y comprensión de código es suficiente como para que valga la pena dedicar el tiempo a algo así. 
    

# Valoración personal de la prueba

Considero que la prueba seguramente no sea perfecta, y es posible que no haya sido 
realizada correctamente, no estoy seguro de si realmente lo que he hecho es lo que 
intentabais que fuera, pero he intentado hacerlo lo mejor posible y dar un 100%.


Me gustaría conocer las partes erróneas o donde podría haber mejorado.


# Conclusión
  
Para la prueba he intentado aplicar todos los conceptos que se requerían y valorarían positivamente aún no habiendo hecho uso de ellos.

Nunca había hecho TDD y he intentado realizar todos los tests posibles antes de llevarlos a cabo, aunque no tuve en cuenta que había que hacer los commits para que vierais cómo los he ido haciendo.
He intentado aplicar al máximo los principios SOLID y hacer un código limpio y estructurado.
También he aprovechado para probar el uso de los streams y las lambdas, que no había utilizado hasta ahora.

Me gustaría exponer que ha sido muy agradable e incluso divertido realizar una prueba de estas características, a pesar de que había cosas que no conocía, ha sido agradable la búsqueda de recursos para poder realizarla con éxito. 

Gracias por darme la oportunidad de presentarme a la prueba.
