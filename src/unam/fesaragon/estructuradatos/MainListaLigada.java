package unam.fesaragon.estructuradatos;

public class MainListaLigada {
    public static void main(String[] args) {
        ListaLigada<SmartPhone> celulares = new ListaLigada<>();
        SmartPhone cel1 = new SmartPhone(2021, "Apple", 13, "iOS");
        SmartPhone cel2 = new SmartPhone(2024, "Samsung", 21, "Android");
        SmartPhone cel3 = new SmartPhone(2017, "Google", 6, "Android");
        SmartPhone cel4 = new SmartPhone(2020, "OnePlus", 9, "Android");
        SmartPhone cel5 = new SmartPhone(2019, "Sony", 3, "Android");
        // Agregar 5 SmartPhones
        celulares.agregarAlFinal(cel1);
        celulares.agregarAlFinal(cel2);
        celulares.agregarAlFinal(cel3);
        celulares.agregarAlFinal(cel4);
        celulares.agregarAlFinal(cel5);

        // Imprimir el contenido
        System.out.println("Contenido de la lista:");
        celulares.transversal();

        // Eliminar el de la posición 2
        celulares.eliminar(2);

        // Volver a imprimir el contenido
        System.out.println();
        System.out.println("Lista despues de eliminar el elemento 2:");
        celulares.transversal();

        // Actualizar el segundo elemento
        celulares.actualizar(cel3, new SmartPhone(2022, "Google", 7, "Android"));

        // Volver a imprimir el contenido
        System.out.println();
        System.out.println("Lista despues de actualizar el elemento 2:");
        celulares.transversal();

        // Agregar un elemento al inicio y otro diferente al final
        celulares.agregarAlInicio(new SmartPhone(2024, "Huawei", 50, "HarmonyOS"));
        celulares.agregarAlFinal(new SmartPhone(2018, "Xiaomi", 11, "Android"));

        // Volver a imprimir el contenido
        System.out.println();
        System.out.println("Agregando al principio y al final:");
        celulares.transversal();

        // Eliminar el primero
        celulares.eliminarElPrimero();

        // Volver a imprimir el contenido
        System.out.println();
        System.out.println("Eliminando el primer elemento:");
        celulares.transversal();
    }

}
