class Universidad:
    def __init__(self, nombre, id, correo):
        self.nombre = nombre
        self.id = id
        self.correo = correo

    def mostrar_datos(self):
        print(f"Nombre: {self.nombre}")
        print(f"ID: {self.id}")
        print(f"Correo: {self.correo}")

class Estudiante(Universidad):
    def __init__(self, nombre, id, correo, carrera, promedio):
        super().__init__(nombre, id, correo)
        self.carrera = carrera
        self.promedio = promedio

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Carrera: {self.carrera}")
        print(f"Promedio: {self.promedio}")

class Docente(Universidad):
    def __init__(self, nombre, id, correo, materia):
        super().__init__(nombre, id, correo)
        self.materia = materia

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Materia: {self.materia}")

class Administrativo(Universidad):
    def __init__(self, nombre, id, correo, departamento):
        super().__init__(nombre, id, correo)
        self.departamento = departamento

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"Departamento: {self.departamento}")

if __name__ == "__main__":
    est = Estudiante("Ana López", "E123", "ana@uni.edu", "Ingeniería", 8.9)
    doc = Docente("Dr. Pérez", "D456", "perez@uni.edu", "Matemáticas")
    adm = Administrativo("Carlos Ruiz", "A789", "carlos@uni.edu", "Finanzas")

    print("=== Estudiante ===")
    est.mostrar_datos()
    print("\n=== Docente ===")
    doc.mostrar_datos()
    print("\n=== Administrativo ===")
    adm.mostrar_datos()
