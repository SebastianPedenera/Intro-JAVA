package Service;

import Entidades.Cuotas;
import Entidades.Polizas;
import Entidades.Vehiculos;
import Entidades.Clientes;
import Enum.TipoVehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Polizas> listaPoliza;
    Vehiculos vehiculo;
    Clientes clientes;
    Cuotas cuotas;

    public PolizaService() {
        this.listaPoliza = new ArrayList();
        this.vehiculo = new Vehiculos();
        this.cuotas = new Cuotas();
        this.clientes=new Clientes();
    }

    public Clientes crearCliente() {
        System.out.println("Ingrese el nombre del cliente");
        clientes.setNombre(sc.next());
        System.out.println("Ingrese el apellido del cliente");
        clientes.setApellido(sc.next());
        System.out.println("Ingrese el DNI del cliente");
        clientes.setDni(sc.nextInt());
        clientes.setDomicilio(clientes.getApellido() + " " + clientes.getDni());
        clientes.setMail(clientes.getNombre() + "@" + clientes.getApellido());
        clientes.setTelefono(clientes.getDni() + 1123);
        return clientes;
    }

    public Vehiculos crearVehiculo() {
        System.out.println("Ingrese la marca del vehiculo");
        vehiculo.setMarca(sc.next());
        System.out.println("Ingrese el modelo del vehiculo");
        vehiculo.setModelo(sc.next());
        System.out.println("Ingrese el color del vehiculo");
        vehiculo.setColor(sc.next());
        System.out.println("Ingrese el tipo del vehiculo");
        for (TipoVehiculo aux : TipoVehiculo.values()) {
            System.out.println(aux);
        }
        boolean opc = false;
        do {
            String tipo = sc.next();
            for (TipoVehiculo aux : TipoVehiculo.values()) {
                if (aux.toString().equalsIgnoreCase(tipo)) {
                    vehiculo.setTipo(aux);
                    opc = true;
                }
            }
        } while (!opc);
        vehiculo.setNumChasis(vehiculo.getTipo().ordinal() + 5123);
        vehiculo.setNumMotor(vehiculo.getTipo().ordinal() + 3123);
        vehiculo.setAnio(2010 + vehiculo.getTipo().ordinal());
        return vehiculo;
    }

    public Polizas crearPoliza() {
        Polizas poliza = new Polizas();
        poliza.setNumPoliza((int) Math.random() * (1000));
        poliza.setClientePoliza(crearCliente());
        poliza.setVehiculoPoliza(crearVehiculo());
        int opc = vehiculo.getTipo().ordinal();
        switch (opc) {
            case 0:
                poliza.setMontoTotalAsegurado(2000000);
                break;
            case 1:
                poliza.setMontoTotalAsegurado(4000000);
                break;
            case 2:
                poliza.setMontoTotalAsegurado(6000000);
                break;
            case 3:
                poliza.setMontoTotalAsegurado(8000000);
                break;
            case 4:
                poliza.setMontoTotalAsegurado(10000000);
                break;
        }
        System.out.println("Elija si quiere o no seguro contra granizo (s/n): ");
        String granizo = sc.next();
        if (granizo.equalsIgnoreCase("s")) {
            poliza.setGranizo(true);
        }
        poliza.setGranizo(false);
        if (poliza.isGranizo()) {
            poliza.setMontoMaxGranizo(500000);
        }
        poliza.setInicioPoliza(2023);
        poliza.setInicioPoliza(2025);
        poliza.setCantCuotas(crearCuota());
        return poliza;
    }
    
    public void fabricaPoliza(){
        System.out.println("¿Cuantos clientes quiere ingresar?");
        int cliente = sc.nextInt();
        for (int i = 0; i < cliente; i++) {
        listaPoliza.add(crearPoliza());    
        }
    }

    public boolean pagarCuota() {
        boolean paga = false;
        System.out.println("¿Desea pagar una cuota? (s/n)");
        String pagos = sc.next();
        if (pagos.equalsIgnoreCase("s")) {
            paga =true;
        }
        return paga;
    }

    public Cuotas crearCuota() {
        System.out.println("Ingrese la cantidad de cuotas (12 / 24 / 36)");
        int cuota = sc.nextInt();
        cuotas.setNumCuotas(cuota);
        System.out.println("Ingrese la forma de pago (Efectivo / Debito / Crédito)");
        cuotas.setFormaPago(sc.next());
        cuotas.setMontoCuota(3000);
        cuotas.setPaga(pagarCuota());
        if (cuotas.isPaga()) {
        cuotas.setNumCuotas(cuota-1);    
        }
        //cuotas.setVencimiento(cuota);
        return cuotas;
    }
    
    public void mostrar(){
        System.out.println("------------------------------------");
        for (Polizas polizas : listaPoliza) {
            System.out.println(polizas);
        }
        
    }
}
