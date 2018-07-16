public class NombreAdapter{
	Nombre claseQnoSe = new Nombre();

	public void setNombreCompleto(String n){//este metodo lo entiendo por que se como mi clase lo utiliza
		claseQnoSe.setNombreCompleto(n);
	}
	public String getNombreCompleto(){// este tambien lo entiedo por lo mismo
		return claseQnoSe.getNombreCompleto();
	}

	//_______________________________________________________________________
	//dos metodos extra

	public String getNombre(){
		return claseQnoSe.getNombreCompleto().split(" ")[0];
	}
	public String getApellidos(){
		return claseQnoSe.getNombreCompleto().split(" ")[1];
	}
}