package MODEL;

import DTO.ClienteDTO;
import DTO.EmitenteDTO;
import DTO.FornecedorDTO;

public class GeraPessoa implements FabricyGeral{

	@Override
	public EmitenteDTO criarEmitente() {
		// TODO Auto-generated method stub
		return new EmitenteDTO();
	}

	@Override
	public ClienteDTO criarCliente() {
		// TODO Auto-generated method stub
		return new ClienteDTO();
	}

	@Override
	public FornecedorDTO criarFormecedor() {
		// TODO Auto-generated method stub
		return new FornecedorDTO();
	}

}
