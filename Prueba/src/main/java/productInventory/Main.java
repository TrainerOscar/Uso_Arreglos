package productInventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventario = new Inventory();

        Product producto1 = new Product(101, "Cuaderno uam", 20, 120);
        Product producto2 = new Product(102, "Camisa uam", 30, 260);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        System.out.println("Inventario antes de eliminar productos con cantidad cero:");
        inventario.mostrarInventario();

        inventario.eliminarProductosConCantidadCero();

        System.out.println("\nInventario después de eliminar productos con cantidad cero:");
        inventario.mostrarInventario();

        inventario.actualizarCantidad(102, 15);

        System.out.println("\nInventario después de actualizar cantidades:");
        inventario.mostrarInventario();
    }
}

