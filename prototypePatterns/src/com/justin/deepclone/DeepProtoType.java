package com.justin.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable{
	
	public String name;
	public DeepCloneableTarget deepCloneableTarget;
	public DeepProtoType() {
		super();
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//进行浅拷贝
		DeepProtoType deep =(DeepProtoType) super.clone();
		try{
			//检查deepCloneableTarget是否可以克隆
			if (deepCloneableTarget != null && deepCloneableTarget instanceof Cloneable){
				deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
			}else {
				throw new IllegalStateException("deepCloneableTarget is not Cloneable");
			}
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
			throw new RuntimeException("clone error",e);
		}
		return deep;
	}

	
	public Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
}
