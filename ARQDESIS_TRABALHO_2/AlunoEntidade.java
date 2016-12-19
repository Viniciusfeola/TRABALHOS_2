package arqdesis_aula02b;


public class AlunoEntidade {

	private int cod;
	private String nome;
	private String end;
	private String num;
	private String comp;
	private String dataNasc;
	private String email;
	private String telRes;
	private String telCel;
	private String rg;
	private String cpf;

	public AlunoEntidade() {

		this(0, "", "", "", "", "", "", "", "", "", "");
	}

	public AlunoEntidade(int cod, String nome, String end, String num,
			String comp, String dataNasc, String email, String telRes,
			String telCel, String rg, String cpf) {

		setCod(cod);
		setNome(nome);
		setEnd(end);
		setNum(num);
		setComp(comp);
		setDataNasc(dataNasc);
		setEmail(email);
		setTelRes(telRes);
		setTelCel(telCel);
		setRg(rg);
		setCpf(cpf);
	}

	public String getTelRes() {
		return telRes;
	}

	public void setTelRes(String telRes) {
		this.telRes = telRes;
	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getEnd() {
		return end.toUpperCase();
	}

	public void setEnd(String end) {
		this.end = end.toUpperCase();
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getComp() {
		return comp.toUpperCase();
	}

	public void setComp(String comp) {
		this.comp = comp.toUpperCase();
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void criar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoEntidadeTO to = new AlunoEntidadeTO(cod, nome, end, num, comp,
				dataNasc, email, telRes, telCel, rg, cpf);
		dao.incluir(to);
	}

	public void atualizar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoEntidadeTO to = new AlunoEntidadeTO(cod, nome, end, num, comp, dataNasc, email, telRes, telCel, rg, cpf);
		dao.atualizar(to);
	}

	public void excluir() {
		AlunoDAO dao = new AlunoDAO();
		AlunoEntidadeTO to = new AlunoEntidadeTO(cod, nome, end, num, comp, dataNasc, email, telRes, telCel, rg, this.cpf);
		dao.excluir(to);
	}

	public void carregar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoEntidadeTO to = dao.carregar(this.cpf);
		setCod(to.getCod());
		setNome(to.getNome());
		setEnd(to.getEnd());
		setNum(to.getNum());
		setComp(to.getComp());
		setDataNasc(to.getDataNasc());
		setEmail(to.getEmail());
		setTelRes(to.getTelRes());
		setTelCel(to.getTelCel());
		setRg(to.getRg());
		setCpf(to.getCpf());
	}

	// @Override
	// public String toString() {
	// return "Cliente [id=" + id + ", nome=" + nome + ", fone=" + fone + "]";
	// }
}
