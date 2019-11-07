#language: es

Característica: Busqueda Despachos
  Alejandra como ciudadana
  Quiere consultar despachos de jurisdiccion disciplinaria
  Para obtener informacion basica como su direccion y telefono

  Escenario: Buscar despachos de jurisdiccion disciplinaria
    Dado que "Alejandra" esta consultando despachos de jurisdiccion disciplinaria
    Cuando selecciona Departamento "ANTIOQUIA", Ciudad "MEDELLÍN-ANTIOQUIA" y Jurisdiccion "DISCIPLINARIA / N.A."

    Entonces debe poder mostrar informacion de 4 despachos