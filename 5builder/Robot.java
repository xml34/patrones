import java.util.*;

public interface Robot{

	//metodo que pone a trabajar el robot
	public void trabajar();

	//metodo que cargará las acciones solicitadas
	//por el builder en tiempo de ejecccion
	public void cargaAcciones(List<Integer> accion);
}