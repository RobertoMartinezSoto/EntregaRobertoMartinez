package proyectoRobertoMartinez;

public class RobertoMartinezHobby {
	public String obra;
	public String compositor;
	public String nombreHobby;
	
	public RobertoMartinezHobby(String obra, String compositor, String nombreHobby) {
		this.obra=obra;
		this.compositor=compositor;
		this.nombreHobby=nombreHobby;
	}
	public String getObra() {
		return obra;
	}
	public void setObra(String obra) {
		this.obra=obra;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor=compositor;
	}
	public String getNombreHobby() {
		return nombreHobby;
	}
	
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby=nombreHobby;
	}
	private void imprimir() {
		for(int i=0;i<1000;i++) {
			System.out.println(nombreHobby);
		}
	}

}
