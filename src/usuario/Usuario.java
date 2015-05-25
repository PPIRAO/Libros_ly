package usuario;

public class Usuario {
	private String nick;
	private String psswrd;
	private String mail;
	private boolean premium;
	private int idCliente;
	
	public Usuario( String mail,String psswrd) {
		super();
		this.mail = mail;
		this.psswrd = psswrd;
	}
	
	public Usuario(String nick, String psswrd, String mail) {
		super();
		this.nick = nick;
		this.psswrd = psswrd;
		this.mail = mail;
		
	}
	public Usuario(String nick, String psswrd, String mail,int idCliente) {
		super();
		this.nick = nick;
		this.psswrd = psswrd;
		this.mail = mail;
		this.idCliente=idCliente;
		
	}
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPsswrd() {
		return psswrd;
	}

	public void setPsswrd(String psswrd) {
		this.psswrd = psswrd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}
