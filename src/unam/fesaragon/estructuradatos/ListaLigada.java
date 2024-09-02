package unam.fesaragon.estructuradatos;

public class ListaLigada<T> {
    private T dato;
    private int tamanio;
    private Nodo<T> Siguiente;
    private Nodo<T> head;

    // Constructores
    public ListaLigada() {
    }

    public ListaLigada(T dato) {
        this.dato = dato;
    }

    public ListaLigada(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        Siguiente = siguiente;
    }

    // Comprobar si está vacía
    public boolean estaVacia() {
        return this.tamanio == 0;
    }

    // Agregar al final de la lista
    public void agregarAlFinal(T dato) {
        if (!estaVacia()) {
            Nodo<T> aux = head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new Nodo<>(dato));
        } else {
            head = new Nodo<>(dato);
        }
        this.tamanio++;
    }

    // Agregar al inicio de la lista
    public void agregarAlInicio(T dato) {
        if (!estaVacia()) {
            Nodo<T> nuevo = new Nodo<>(dato, this.head);
            this.head = nuevo;
        } else {
            head = new Nodo<>(dato);
        }
        this.tamanio++;
    }

    // Agregar después de
    public void agregarDespuesDe(T referencia, T dato) {
        if (estaVacia()) {
            agregarAlInicio(dato);
        } else {
            Nodo<T> aux = head;
            while (aux != null && !aux.getDato().equals(referencia)) {
                aux = aux.getSiguiente();
            }
            if (aux != null) {
                aux.setSiguiente(new Nodo<>(dato, aux.getSiguiente()));
            }
        }
        this.tamanio++;
    }

    // Metodo para eliminar por posición
    public void eliminar(int posicion) {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
            return;
        }
        if (posicion > this.tamanio || posicion < 1) {
            System.out.println("La posición que quieres eliminar está fuera de rango");
            return;
        }

        if (posicion == 1) {
            head = head.getSiguiente();
        } else {
            Nodo<T> aux = head;
            for (int i = 1; i < posicion - 1; i++) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        this.tamanio--;
    }

    //Metodo para eliminar el primero
    public void eliminarElPrimero() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            head = head.getSiguiente();
            tamanio--;
        }
    }
    //Metodo para eliminar el ultimo elemento
    public void eliminarElFinal() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else if (head.getSiguiente() == null) {
            head = null;
            tamanio--;
        } else {
            Nodo<T> aux = head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
            tamanio--;
        }
    }

    public int buscar(T valor) {
        if (estaVacia()) {
            System.out.println("¡La lista está vacía!");
            return 0;
        } else {
            Nodo<T> aux = head;
            int posicion = 1;
            while (aux != null) {
                if (aux.getDato().equals(valor)) {
                    return posicion;
                }
                aux = aux.getSiguiente();
                posicion++;
            }
            return 0;
        }
    }

    public void actualizar(T a_buscar, T valor) {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo<T> aux = head;
            while (aux != null) {
                if (aux.getDato().equals(a_buscar)) {
                    aux.setDato(valor);
                    return;
                }
                aux = aux.getSiguiente();
            }
            System.out.println("No se encuentra en la lista el elemnento que intentas buscxar");
        }
    }


    // Metodo para imprimir la lista
    public void transversal() {
        if (estaVacia()) {
            System.out.println("Esta vacía la lista");
        } else {
            Nodo<T> aux = head;
            while (aux != null) {
                System.out.print("|" + aux.getDato() + "| --> ");
                aux = aux.getSiguiente();
            }
            System.out.println();
        }
    }

    // Getters y setters
    public void setSiguiente(Nodo<T> siguiente) {
        Siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getTamanio() {
        return tamanio;
    }

    public Nodo<T> getSiguiente() {
        return Siguiente;
    }
}
