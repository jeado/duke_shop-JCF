package com.dukeShop.file;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import jcf.upload.FileInfo;
import jcf.upload.MultiPartInfo;
import jcf.upload.handler.UploadEventHandler;
import jcf.upload.persistence.PersistenceManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

public class ProductEventHandler implements UploadEventHandler {


	@Autowired
	private ProductService productService;


	//파일이름
	public String createFileNameIfAccepted(String folder, FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}
	//폴더이름
	public String getFolder(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "product";
	}
	//최대업로드 사이즈
	public long getMaxUploadSize() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	public void postprocess(String folder, MultiPartInfo info,
			PersistenceManager persistenceManager) {
		// TODO Auto-generated method stub
		Map<String, Object> attribute = info.getAttributes();
		String pid = (String) attribute.get("pid");

		List<FileInfo> fileInfos = info.getFileInfos();
		FileInfo fileInfo = fileInfos.get(0);
		String callName = fileInfo.getCallName();
		String name = fileInfo.getName();

		System.out.println("PID = "+pid);
		System.out.println("Original Name : "+name);
		System.out.println("CallName : "+callName);
		Product product = null;
		//productService.insertProduct(product);
	}

	public void prepareStorage(PersistenceManager persistenceManager,
			String folder) {
		// TODO Auto-generated method stub

	}

}
