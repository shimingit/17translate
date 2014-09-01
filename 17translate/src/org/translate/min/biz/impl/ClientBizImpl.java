package org.translate.min.biz.impl;

import org.translate.min.biz.ClientBiz;
import org.translate.min.dao.ClientDao;

public class ClientBizImpl implements ClientBiz
{
	private ClientDao clientdao;
	
	public String register(String name, String password, String phone,
			String account)
	{
		return clientdao.register(name, password, phone, account);
	}
	
	
	
	public void setClientdao(ClientDao clientdao)
	{
		this.clientdao = clientdao;
	}
	
}
