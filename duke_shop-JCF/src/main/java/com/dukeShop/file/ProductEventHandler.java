package com.dukeShop.file;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

import jcf.upload.FileInfo;
import jcf.upload.MultiPartInfo;
import jcf.upload.handler.UploadEventHandler;
import jcf.upload.persistence.PersistenceManager;

public class ProductEventHandler implements UploadEventHandler {

	@Autowired
	private ProductService productService;

	public String createFileNameIfAccepted(String folder, FileInfo fileInfo) {

		//난수를 발생시켜서 중복되는 파일값이 없도록 한다.
		return UUID.randomUUID().toString();
	}

	public String getFolder(HttpServletRequest request) {
		return "product";
	}

	public long getMaxUploadSize() {
		return 100000;
	}

	public void postprocess(String folder, MultiPartInfo info,
			PersistenceManager persistenceManager) {

		Map<String, Object> attributes = info.getAttributes();
		String pid = (String) attributes.get("pid");


		List<FileInfo> fileInfos = info.getFileInfos();
		FileInfo fileInfo = fileInfos.get(0);
		//상위에 지정해 놓은 난수값을 받아올수 있다.
		String callName = fileInfo.getCallName();
		String name = fileInfo.getName();

		System.out.println("PID  :  "+pid+". Original Name: "+name+" .CallName: "+callName);

		//Product product = null;
		//productService.insertProduct(product);
	}

	public void prepareStorage(PersistenceManager persistenceManager, String folder) {
	}

}
