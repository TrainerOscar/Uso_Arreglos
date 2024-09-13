package productInventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productos;

    public Inventory() {
        productos = new ArrayList<>();
    }

    public boolean agregarProducto(Product producto) {
        for (Product product : productos) {
            if (product.getCodigo() == producto.getCodigo()) {
                System.out.println("Error: El producto con el código " + producto.getCodigo() + " ya existe.");
                return false;
            }
        }
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
        return true;
    }

    public boolean actualizarCantidad(int codigo, int nuevaCantidad) {
        for (Product product : productos) {
            if (product.getCodigo() == codigo) {
                product.setCantidad(nuevaCantidad);
                System.out.println("Cantidad actualizada para el producto con código: " + codigo);
                return true;
            }
        }
        System.out.println("Error: Producto con código " + codigo + " no encontrado.");
        return false;
    }

    public void eliminarProductosConCantidadCero() {
        productos.removeIf(product -> {
            if (product.getCantidad() == 0) {
                System.out.println("Eliminando producto con código: " + product.getCodigo());
                return true;
            }
            return false;
        });
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Product product : productos) {
                product.mostrarInformacion();
                System.out.println("---------------");
            }
        }
    }
    }

