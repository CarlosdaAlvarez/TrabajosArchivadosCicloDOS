class Vehiculo:
    def __init__(self, matricula, modelo, num_llantas):  # Corregido __init__
        self.matricula = matricula
        self.modelo = modelo
        self.num_llantas = num_llantas

    def velocidad_permitida(self):
        return 0


class Taxi(Vehiculo):
    def __init__(self, matricula, modelo, num_llantas, licencia, personas):  # Corregido __init__
        super().__init__(matricula, modelo, num_llantas)  # Corregido __init__
        self.licencia = licencia
        self.personas = personas

    def velocidad_permitida(self):
        if self.personas == 0:
            return 80
        else:
            return 70

    def mostrar_informacion(self):
        print("Taxi:")
        print("Matrícula:", self.matricula)
        print("Modelo:", self.modelo)
        print("Llantas:", self.num_llantas)
        print("Licencia:", self.licencia)
        print("Personas:", self.personas)
        print("Velocidad Permitida:", self.velocidad_permitida(), "km/h")
        print("------------")


class Bus(Vehiculo):
    def __init__(self, matricula, modelo, num_llantas, num_plazas, personas):  # Corregido __init__
        super().__init__(matricula, modelo, num_llantas)  # Corregido __init__
        self.num_plazas = num_plazas
        self.personas = personas

    def velocidad_permitida(self):
        if self.personas > 1:
            return 40
        else:
            return 60

    def mostrar_informacion(self):
        print("Bus:")
        print("Matrícula:", self.matricula)
        print("Modelo:", self.modelo)
        print("Llantas:", self.num_llantas)
        print("Plazas:", self.num_plazas)
        print("Personas:", self.personas)
        print("Velocidad Permitida:", self.velocidad_permitida(), "km/h")
        print("------------")


# Crear objetos de prueba
taxi1 = Taxi("ABC123", "Toyota Lexus", 4, "LIC456", 0)
taxi2 = Taxi("DEF789", "Chevrolet", 4, "LIC789", 2)

bus1 = Bus("BUS321", "Mercedes", 6, 30, 0)
bus2 = Bus("BUS654", "Volvo", 6, 40, 20)

# Mostrar información
taxi1.mostrar_informacion()
taxi2.mostrar_informacion()
bus1.mostrar_informacion()
bus2.mostrar_informacion()
