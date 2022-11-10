package cl.generation.f20221103;

public class Telefono {
	
	private String numero;
	private String compannia;
	private Boolean plan;
	private Boolean internet;
	
	public Telefono() {
		super();
	}

	public Telefono(String numero, String compannia, Boolean plan, Boolean internet) {
		super();
		this.numero = numero;
		this.compannia = compannia;
		this.plan = plan;
		this.internet = internet;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	public Boolean getPlan() {
		return plan;
	}

	public void setPlan(Boolean plan) {
		this.plan = plan;
	}

	public Boolean getInternet() {
		return internet;
	}

	public void setInternet(Boolean internet) {
		this.internet = internet;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", compannia=" + compannia + ", plan=" + plan + ", internet=" + internet
				+ "]";
	}
	
	
	
	
	
}
