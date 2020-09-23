package com.dr.dao;

import org.springframework.stereotype.Repository;

import com.dr.bo.HomeBO;

@Repository
public class HomeDaoImpl implements IHomeDao {

	@Override
	public HomeBO getHomeContent() {
		
		//domy data
		String title="Biswaranjan Pradhan";
		String bc="Biswaranjan PradhanBiswaranjan PrBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan PradhanBiswaranjan Pradhan";
		
		//add data to homebo
		HomeBO hbo=new HomeBO();
		hbo.setTitle(title);
		hbo.setBodyContent(bc);
		return hbo;
	}

}
