package MODEL;

import DTO.ClienteDTO;
import DTO.EmitenteDTO;
import DTO.FornecedorDTO;

public interface FabricyGeral {
	
	public EmitenteDTO criarEmitente();
	
	public ClienteDTO criarCliente();
	
	public FornecedorDTO criarFormecedor();

}
