package usuario;

public class Usuario {
	private String nick;
	private String psswrd;
	private String mail;
	private boolean premium;
	private int idCliente;
	private String oldpsswrd;
	private String newpsswrd;
	private boolean falso;
	
	public Usuario(String nick, String oldpsswrd,String newpsswrd,boolean falso){
		super();
		this.nick=nick;
		this.oldpsswrd=oldpsswrd;
		this.newpsswrd=newpsswrd;
		falso=false;
	}
	
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

	public String getOldpsswrd() {
		return oldpsswrd;
	}

	public void setOldpsswrd(String oldpsswrd) {
		this.oldpsswrd = oldpsswrd;
	}

	public String getNewpsswrd() {
		return newpsswrd;
	}

	public void setNewpsswrd(String newpsswrd) {
		this.newpsswrd = newpsswrd;
	}
	
	
	
}
